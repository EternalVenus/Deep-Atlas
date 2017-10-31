import Hydrosphere.SeaCreatures.Fish.Fish;

import java.util.concurrent.TimeUnit;

public class LionFish extends Fish {
    private final static int EYE = 2;
    private final static int SIZE = 5;

    private long days ;
    private long dayDifference;
    private int size;
    private String name;
    private int offSpring;

    public LionFish(String name){
        this.name = name;
        this.size = SIZE + (int) (Math.floor(Math.random()*12));
    }

    public void reproduce(){
        offSpring += 10_000 + (Math.floor((Math.random() * 20_000))); // at least 10,000
        System.out.println(offSpring + "baby lion fish have been born!");
        days = System.currentTimeMillis();
        days = TimeUnit.MILLISECONDS.toDays(days);
        while(true){
            dayDifference = System.currentTimeMillis();
            dayDifference = TimeUnit.MILLISECONDS.toDays(dayDifference);
            if (dayDifference - days > 4){  // after four days, the babies are fully functioning
                System.out.println("the lion fishes are fully grown")
            }
        }
    }

    public void camoflauge(){
        System.out.println("The lion fish uses its unique pattern to blend in to its surroundings.");
    }

    public void poison(){
        System.out.println("uses its dead spikes along its lateral lines to scare and inject predators with poison");
    })

    public void defense(boolean danger) {
        if (danger) {
            camoflauge();
            poison();
        }
    }

    public void invasion(boolean moved){
        if (moved){
            reproduce();
            eat();
            System.out.println("Due to humans, the lion fish is eating away at the exo-system since it does not have predators in this region");
        }
    }

    public static int getEYE() {
        return EYE;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffSpring() {
        return offSpring;
    }
    
}