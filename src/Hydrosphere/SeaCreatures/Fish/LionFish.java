import Hydrosphere.SeaCreatures.Fish.Fish;

public class LionFish extends Fish {
    private final static int EYE = 2;
    private final static int SIZE = 5;

    private int size;
    private String name;
    private int offSpring;

    public LionFish(String name){
        this.name = name;
        this.size = SIZE + (int) (Math.floor(Math.random()*12));
    }

    public void reproduce(){
        offSpring += 1_000_000 + (Math.floor((Math.random() * 1_000_000))); // at least 1,000,000
        System.out.println(offSpring + "baby lion fish have been born!");
    }

    
}