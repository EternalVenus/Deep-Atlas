package Pokemon;

import java.util.Scanner;

public class PokemonBattle {
    private Scanner scan = new Scanner(System.in);
    private PokemonPlayer player1;
    private PokemonPlayer player2;
    private boolean PlayerTurn;
    private boolean battleOver;
    public boolean playerBattle;

    public PokemonBattle(PokemonPlayer player1, PokemonPlayer player2, boolean playerBattle){
        this.player1 = player1;
        this.player2 = player2;
        this.PlayerTurn = true;
        this.battleOver = false;
        this.playerBattle = playerBattle;
    }

    public void startBattle(){
        System.out.println("=========BATTLE STARTS=========");
        if (playerBattle) {
            System.out.println("Pokemon trainer " + player2.getName() + " wants to battle!");
            System.out.println(player2.getName() + " chooses " + player2.getPokemonActive().getName());
            System.out.println("Go! " + player1.getPokemonActive().getName());
            System.out.println("What will " + player1.getPokemonActive().getName() + " do?");

            while (!battleOver){
                if (PlayerTurn){
                    showOptions();
                    // taking the decision of the player
                    int decision = 0;
                    while(decision < 1 || decision > 4){
                        System.out.println("Choose a decision using values 1 - 4");
                        decision = scan.nextInt();
                        scan.nextLine();
                    }

                    decisionMade(decision);

                }

            }
        }

    }

    private void showOptions(){
        System.out.println("1)FIGHT    2)BAG \n" +
                           "3)POKEMON  4)RUN");
    }

    private boolean decisionMade(int decision){
        switch (decision){
            case 1: this.player1.getPokemonActive().showSkills();
                System.out.println("Which move to use?");
                int move = 0;
                while(move < 1 || move > 4){
                    System.out.println("Choose a move using values 1 - 4");
                    move = scan.nextInt();
                    scan.nextLine();
                }
                useSkill(move);
        }
        return true;
    }

    private boolean useSkill(int move){
        Pokemon activePokemon = this.player1.getPokemonActive();
        switch (move){
            case 1:
                System.out.println(activePokemon.getName() + " uses " + activePokemon.getSkill1().getName());
                return true;
            case 2:
                System.out.println(activePokemon.getName() + " use");
                return true;

        }
        return true;
    }


}
