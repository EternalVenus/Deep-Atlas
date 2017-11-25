package Pokemon;

import Pokemon.Pokemons.Pikachu;
import Pokemon.Pokemons.Pokemon;

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
        initialDialogueAndMakeDecision();
    }

    private void initialDialogueAndMakeDecision(){
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
                    decisionMade(showOptionsAndMakeDecision());
                }else{
                    // doesn't matter what integer to pass in, the function generates a random move anyways
                    decisionMade(5);
                }
            }

            // restore all stat multipliers to 1
            if (battleOver){
                for (int i = 0; i < this.player1.getPokemonBag().bagSize(); i++){
                    player1.getPokemonBag().getPokemon().get(i).restoreToBaseMultiplier();
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
                    decisionMade(showOptionsAndMakeDecision());
                }else{
                    // doesn't matter what integer to pass in, the function generates a random move anyways
                    decisionMade(5);
                }
            }

            // restore all stat multipliers to 1
            if (battleOver){
                for (int i = 0; i < this.player1.getPokemonBag().bagSize(); i++){
                    player1.getPokemonBag().getPokemon().get(i).restoreToBaseMultiplier();
                }
            }
        }
    }

    private boolean decisionMade(int decision){
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
                    // this case is when the player picks the bag
                    //initialize a value for the while loop.
                    // the while loop waits for the user to make the right decision
                    int bagPicked = -1;
                    this.player1.getItembag().listBattleBags();

                    while (bagPicked < 0 || bagPicked > 4){
                        System.out.println("Choose a Category (0 - 3) or 4 to cancel");
                        bagPicked = scan.nextInt();
                        scan.nextLine();

                        // go back to options
                        if (bagPicked == 4){
                            return true;
                        }
                    }
                    this.player1.getItembag().listBattleItemInBag(bagPicked);

                    // the switch statement gets the specific bag
                    // then ask for the item that the user want to use
                    switch (bagPicked){
                        case 0:
                            if (medicineBagDecisionMaking()){
                                break;
                            }else{
                                // if the user cancels his decision. Just return back to the option screen
                                return true;
                            }
                        case 1:
                            if (pokeBallBagDecisionMaking()){
                                break;
                            }else{
                                // if the user cancels his decision. Just return back to the option screen
                                return true;
                            }
                        case 2:
                            if (berryBagDecisionMaking()){
                                break;
                            }else{
                                // if the user cancels his decision. Just return back to the option screen
                                return true;
                            }
                        case 3:
                            if (battleItemBagDecisionMaking()){
                                break;
                            }else{
                                // if the user cancels his decision. Just return back to the option screen
                                return true;
                            }
                    }


                    this.playerTurn = false;
                    // need to implement method to use items
                    return true;
                case 3:
                    return choosePokemon(-1);
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

    // If it is player1's turn. The active pokemon will be the first pokemon in party and the enemy pokemon will be
    // wild pokemon or the first pokemon of player2
    // If it is not player1's turn. The active pokemon will be the wild pokemon or the first pokemon of player2
    // the enemy pokemon will be player1's first pokemon
    private boolean useSkill(int move){
            String activePokemonName;
            Pokemon activePokemon;
            Pokemon enemyPokemon;

            if (this.playerTurn){
                activePokemonName = this.player1.getPokemonActive().getName();
                activePokemon = player1.getPokemonActive();
                if (playerBattle){
                    enemyPokemon = player2.getPokemonActive();
                }else{
                    enemyPokemon = wildPokemon;
                }
            }else{
                if (playerBattle){
                    activePokemonName = "Enemy " + this.player2.getPokemonActive().getName();
                    activePokemon = player2.getPokemonActive();
                    enemyPokemon = player1.getPokemonActive();
                }else{
                    activePokemonName = "Wild " + wildPokemon.getName();
                    activePokemon = wildPokemon;
                    enemyPokemon = player1.getPokemonActive();
                }

            }

            switch (move) {
                case 1:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill1().getName());
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    // if this is current players turn
                    if (this.playerTurn){
                        // checks if it is player battle or wild pokemon battle
                        if (playerBattle){
                            // if the enemy pokemon faints. checks if the player2 blacks out
                            // if player2 does not black out. picks the next pokemon of player2
                            if (activePokemon.attack(enemyPokemon, activePokemon.getSkill1())) {
                                System.out.println();
                                System.out.println(enemyPokemon.getName() + " fainted");
                                if (this.player2.isBlackOut()){
                                    System.out.println(player1.getName() + " won the pokemon battle!!");
                                    battleOver = true;
                                }else{
                                    // chooses the next pokemon
                                    this.player2.chooseActivePokemon();
                                }
                            }
                        }else{
                            // if the wild pokemon faints. Battle ends
                            if (activePokemon.attack(enemyPokemon, activePokemon.getSkill1())){
                                System.out.println(wildPokemon.getName() + " fainted");
                                System.out.println(player1.getName() + " won the wild pokemon battle!!");
                                battleOver = true;
                            }
                        }
                    }else{
                        // if the other players turn or the wild pokemon's turn
                        // This "else" statement checks if player1's active pokemon faints
                        // Then checks if the player blacks out or choose the next pokemon
                        if (activePokemon.attack(enemyPokemon, activePokemon.getSkill1())) {
                            System.out.println();
                            System.out.println(enemyPokemon.getName() + " fainted");
                            if (this.player1.isBlackOut()){
                                System.out.println(this.player1.getName() + " ran out of pokemon");
                                System.out.println(this.player1.getName() + " blacked out.");
                                System.out.println(this.player2.getName() + " won the pokemon battle!!!");
                                battleOver = true;
                            }else{
                                // allows player 1 to choose the next pokemon
                                // FINISH THIS METHOD HERE
                                choosePokemon(-1);
                            }
                        }
                    }

                    return true;
                case 2:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill2().getName());
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    activePokemon.attack(enemyPokemon, activePokemon.getSkill2());
                    return true;
                case 3:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill3().getName());
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    activePokemon.attack(enemyPokemon, activePokemon.getSkill3());
                    return true;
                case 4:
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(activePokemonName + " uses " + activePokemon.getSkill4().getName());
                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    activePokemon.attack(enemyPokemon, activePokemon.getSkill4());
                    return true;
                default:
                    System.out.println(activePokemonName + " does not have this skill!");
                    return false;
            }
    }

    // this method executes which pokeball the player chooses
    // if the player decide to cancel his decision. It returns a false value, which can later be used
    // to transfer to the option screen
    private boolean pokeBallBagDecisionMaking(){
        // initialize an initial index and then use the while loop to get input from the user
        int indexOfPokeball = -1;
        while(!this.player1.getItembag().getPokeBallBag().usePokeBall(indexOfPokeball)){
            System.out.println("Pick a Poke Ball to use. " + this.player1.getItembag().getPokeBallBag().getPokeBallList().size() + " to cancel.");
            indexOfPokeball = scan.nextInt();
            scan.nextLine();

            if (indexOfPokeball == this.player1.getItembag().getPokeBallBag().getPokeBallList().size()){
                return false;
            }
        }

        // The player uses the pokeball that was picked
        System.out.println(this.player1.getName() + " uses " + this.player1.getItembag().getPokeBallBag().getPokeBallList().get(indexOfPokeball).getName());
        // check if the pokemon is caught. If the pokemon is caught. Adds the pokemon into the bag
        // otherwise display message and end of player's turn
        if(this.player1.getItembag().getPokeBallBag().getPokeBallList().get(indexOfPokeball).shake()){
            System.out.println("Gotcha! " + wildPokemon.getName() + " was caught!");
            this.player1.getPokemonBag().addToBag(wildPokemon);
            battleOver = true;
        }else{
            System.out.println("Oh no, " + wildPokemon.getName() + " came out of the poke ball");
            playerTurn = false;
        }

        // if the amount of pokeball is equal to zero. remove it from the bag
        if (this.player1.getItembag().getPokeBallBag().getPokeBallList().get(indexOfPokeball).getAmount() == 0){
            this.player1.getItembag().getPokeBallBag().getPokeBallList().remove(indexOfPokeball);
        }

        return true;
    }

    // this method executes which medicine the player chooses
    // if the player decide to cancel his decision. It returns a false value, which can later be used
    // to transfer to the option screen
    private boolean medicineBagDecisionMaking(){
        int indexOfMedicine = -1;
//        this.player1.getPokemonActive().setCurrentHp(10);
        while (!this.player1.getItembag().getMedicineBag().useMedicine(indexOfMedicine, player1.getPokemonActive())){
            System.out.println("Pick a Medicine to use. " + this.player1.getItembag().getMedicineBag().getMedicineList().size() + " to cancel.");
            indexOfMedicine = scan.nextInt();
            scan.nextLine();

            if (indexOfMedicine == this.player1.getItembag().getMedicineBag().getMedicineList().size()){
                return false;
            }
        }

        // if the amount of medicine is equal to zero. remove it from the bag
        if (this.player1.getItembag().getMedicineBag().getMedicineList().get(indexOfMedicine).getAmount() == 0){
            this.player1.getItembag().getMedicineBag().getMedicineList().remove(indexOfMedicine);
        }
        return true;
    }

    // this method executes which medicine the player chooses
    // if the player decide to cancel his decision. It returns a false value, which can later be used
    // to transfer to the option screen
    private boolean berryBagDecisionMaking(){
        int indexOfBerry = -1;
        //this.player1.getPokemonActive().setCurrentHp(10);

        while (!this.player1.getItembag().getBerryBag().useBerry(indexOfBerry, player1.getPokemonActive())){
            System.out.println("Pick a Berry to use. " + this.player1.getItembag().getBerryBag().getBerryList().size() + " to cancel.");
            indexOfBerry = scan.nextInt();
            scan.nextLine();

            if (indexOfBerry == this.player1.getItembag().getBerryBag().getBerryList().size()){
                return false;
            }
        }

        // if the amount of berry is equal to zero. remove it from the bag
        if (this.player1.getItembag().getBerryBag().getBerryList().get(indexOfBerry).getAmount() == 0){
            this.player1.getItembag().getBerryBag().getBerryList().remove(indexOfBerry);
        }
        return true;
    }


    private boolean battleItemBagDecisionMaking(){
        int indexOfBattleItem = -1;
        //this.player1.getPokemonActive().setCurrentHp(10);

        while (!this.player1.getItembag().getBattleItemBag().useBattleItem(indexOfBattleItem, player1.getPokemonActive())){
            System.out.println("Pick a Battle Item to use. " + this.player1.getItembag().getBattleItemBag().getBattleItemList().size() + " to cancel.");
            indexOfBattleItem = scan.nextInt();
            scan.nextLine();

            if (indexOfBattleItem == this.player1.getItembag().getBattleItemBag().getBattleItemList().size()){
                return false;
            }
        }

        // if the amount of berry is equal to zero. remove it from the bag
        if (this.player1.getItembag().getBattleItemBag().getBattleItemList().get(indexOfBattleItem).getAmount() == 0){
            this.player1.getItembag().getBattleItemBag().getBattleItemList().remove(indexOfBattleItem);
        }
        return true;
    }

    private void showOptions(boolean playerBattle){
        Pokemon playerActivePokemon = player1.getPokemonActive();
        if (playerBattle){
            Pokemon pokemonActive = player2.getPokemonActive();
            System.out.println();
            System.out.println("\t\t\t\t\tLV: " + pokemonActive.getLevel() + " " + pokemonActive.getName());
            System.out.println("\t\t\t\t\tHP: " + pokemonActive.getCurrentHp());
            System.out.println("LV: " + playerActivePokemon.getLevel() + " " + playerActivePokemon.getName());
            System.out.println("HP: " + playerActivePokemon.getCurrentHp());
            System.out.println("====================");
            System.out.println("| 1)FIGHT      2)BAG |\n" +
                    "| 3)POKEMON    4)RUN |");
            System.out.println("======================");
        }else{
            System.out.println();
            System.out.println("\t\t\t\t\tLV: " + wildPokemon.getLevel() + " " + wildPokemon.getName());
            System.out.println("\t\t\t\t\tHP: " + wildPokemon.getCurrentHp());
            System.out.println("LV: " + playerActivePokemon.getLevel() + " " + playerActivePokemon.getName());
            System.out.println("HP: " + playerActivePokemon.getCurrentHp());
            System.out.println("====================");
            System.out.println("| 1)FIGHT      2)BAG |\n" +
                    "| 3)POKEMON    4)RUN |");
            System.out.println("======================");
        }

    }

    private int showOptionsAndMakeDecision(){
        showOptions(playerBattle);
        // taking the decision of the player
        int decision = 0;
        while(decision < 1 || decision > 4){
            System.out.println("Choose a decision using values 1 - 4");
            decision = scan.nextInt();
            scan.nextLine();
        }

        return decision;
    }

    private boolean choosePokemon(int pokemonChosen){
        this.player1.getPokemonBag().listPokemons();
        System.out.println("Choose a Pokemon");
        while(pokemonChosen < 0 || pokemonChosen > 5){
            System.out.println("Choose a pokemon (0 - 5)");
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
    }
}
