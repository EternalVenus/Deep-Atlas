package Pokemon;

public class PokemonBattle {
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
            System.out.println(player2.getName() + " wants to battle!");
            System.out.println(player1.getName() + " sent out ");
//            System.out.println();
//            while (!battleOver){
//                if (PlayerTurn){
//                    showOptions();
//                }
//
//            }
        }

    }

    private void showOptions(){
        System.out.println("1)FIGHT    2)BAG \n" +
                           "3)POKEMON  4)RUN");
    }


}
