package World.Player;

public class Main {
    public static void main(String[] args){

        Player player = new Player("David", 100, "Axe");

        System.out.println("Initial Health is " + player.getHitPoint());
    }
}
