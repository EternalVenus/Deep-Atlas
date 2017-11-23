package Pokemon;

import Pokemon.Pokemons.Pikachu;

import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    private Scanner scan = new Scanner(System.in);
    private PokemonPlayer player1;
    private PokemonPlayer player2;
    private Pokemon wildPokemon;

    // keeping track of player's turn vs the enemy's turn
    private boolean playerTurn;
    // keep tracks if the battle is over
    private boolean battleOver;
    // boolean to show if its a player battle or a wild pokemon battle
    private boolean playerBattle;

    // used to generate a random number
    private Random random = new Random();

    // constructor for pokemon player battle
    public PokemonBattle(PokemonPlayer player1, PokemonPlayer player2){
        this.player1 = player1;
        this.player2 = player2;
        // the player always go first
        this.playerTurn = true;
        this.battleOver = false;
        // true for player battle, false for wild pokemon battle
        this.playerBattle = true;
    }

    // Overloaded constructor for wild pokemon battle.
    // need to implement a random pokemon generator
    public PokemonBattle(PokemonPlayer player){
        this.player1 = player;
        this.playerTurn = true;
        this.battleOver = false;
        this.playerBattle = false;

        Pikachu pikachu = new Pikachu();
        this.wildPokemon = pikachu;
    }

    // Overloaded constructor for wild pokemon battle
    public PokemonBattle(PokemonPlayer player, Pokemon pokemon){
        this.player1 = player;
        this.playerTurn = true;
        this.battleOver = false;
        this.playerBattle = false;

        this.wildPokemon = pokemon;
    }


    // starting battle method
    public void startBattle(){
        System.out.println("=========BATTLE STARTS=========");
        // choose between playerBattle and wild pokemon battle
        this.playerTurn = true;

        if (playerBattle) {
            // shows the initial messages at the beginning of a battle
            System.out.println("Pokemon trainer " + player2.getName() + " wants to battle!");
            System.out.println(player2.getName() + " chooses " + player2.getPokemonActive().getName() + "\n");
            System.out.println("Go! " + player1.getPokemonActive().getName());
            System.out.println("What will " + player1.getPokemonActive().getName() + " do?");

            // loops until battle over = true;
            while (!battleOver){
                // keep track of player turn vs enemy player turn
                if (playerTurn){
                    int decisionOfPlayer = showOptionsAndMakeDecision();
                    decisionMade(decisionOfPlayer);
                }else{
                    // doesn't matter what integer to pass in, the function generates a random move anyways
                    decisionMade(5);
                }
            }
        }else{
            System.out.println("A wild " + wildPokemon.getName() + " has appeared!");
            System.out.println("Go! " + player1.getPokemonActive().getName());
            System.out.println("What will " + player1.getPokemonActive().getName() + " do?");

            // loops until battle over = true;
            while (!battleOver){
                // keep track of player turn vs enemy player turn
                if (playerTurn){
                    int decisionOfPlayer = showOptionsAndMakeDecision();
                    decisionMade(decisionOfPlayer);
                }else{
                    // doesn't matter what integer to pass in, the function generates a random move anyways
                    decisionMade(5);
                }
            }
        }

    }


    private boolean decisionMade(int decision){
        int pokemonChosen = -1;
        // creates a random number from 1 - 4 for the move of the enemy pokemon
        int randomMoveOfEnemy = random.nextInt(4) + 1;

        if (this.playerTurn){
            switch (decision){
                case 1:
                    this.player1.getPokemonActive().showSkills();
                    System.out.println("Which move to use?");
                    int move = 0;
                    while(move < 1 || move > 4){
                        System.out.println("Choose a move using values 1 - 4");
                        move = scan.nextInt();
                        scan.nextLine();
                    }
                    useSkill(move);
                    // still need to implement this function
                    // need to add the function to attack enemy pokemon
                    // damage calculation here
                    this.playerTurn = false;
                    return true;
                case 2:
                    int bagPicked = -1;
                    this.player1.getItembag().listBattleBags();

                    while (bagPicked < 0 || bagPicked > 4){
                        System.out.println("Choose a Category (0 - 4) or 5 to cancel");
                        bagPicked = scan.nextInt();
                        scan.nextLine();

                        // go back to options
                        if (bagPicked == 5){
                            return true;
                        }
                    }

                    this.player1.getItembag().listBattleItemInBag(bagPicked);
                    // need to implement method to use items
                    return true;
                case 3:
                    this.player1.getPokemonBag().listPokemons();
                    System.out.println("Choose a Pokemon");
                    while(pokemonChosen < 0 || pokemonChosen > 5){
                        System.out.println("Choose a decision using values 0 - 5");
                        pokemonChosen = scan.nextInt();
                        scan.nextLine();
                    }

                    // if the player successfully switches, it is enemy player turn
                    if (this.player1.switchPokemon(pokemonChosen)) {
                        this.playerTurn = false;
                        return true;
                    }else {
                        return false;
                    }
                case 4:
                    if (playerBattle){
                        System.out.println("Can't run from a trainer battle!");
                        return false;
                    }else{
                        System.out.println("Safely got away!");
                        battleOver = true;
                        return true;
                    }
                default:
                    System.out.println("There is no such command.");
                    return false;
            }
        }else{
            // generate a random skill from the enemy active pokemon
            useSkill(randomMoveOfEnemy);
            this.playerTurn = true;
            return true;
        }

    }

    private boolean useSkill(int move){
            // use this string to differentiate "Enemy Pokemon"
            String activePokemonName;
            Pokemon activePokemon;
            if (this.playerTurn){
                activePokemonName = this.player1.getPokemonActive().getName();
                activePokemon = player1.getPokemonActive();
            }else{
                if (playerBattle){
                    activePokemonName = "Enemy " + this.player2.getPokemonActive().getName();
                    activePokemon = player2.getPokemonActive();
                }else{
                    activePokemonName = "Wild " + wildPokemon.getName();
                    activePokemon = wildPokemon;
                }

            }

            switch (move) {
                case 1:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill1().getName());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    return true;
                case 2:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill2().getName());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    return true;
                case 3:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill3().getName());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    return true;
                case 4:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill4().getName());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    return true;
                default:
                    System.out.println(activePokemonName + " does not have this skill!");
                    return false;
            }
    }


    private void showOptions(){
        System.out.println();
        System.out.println("====================");
        System.out.println("| 1)FIGHT    2)BAG |\n" +
                "| 3)POKEMON  4)RUN |");
        System.out.println("======================");
    }

    private int showOptionsAndMakeDecision(){
        showOptions();
        // taking the decision of the player
        int decision = 0;
        while(decision < 1 || decision > 4){
            System.out.println("Choose a decision using values 1 - 4");
            decision = scan.nextInt();
            scan.nextLine();
        }

        return decision;
    }

}
