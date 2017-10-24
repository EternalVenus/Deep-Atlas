package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Prey;

public class Rabbit extends Animal implements Prey{

    /******** Static Fields ********/
    private final static int EYE = 2;
    private final static int LEG = 4;
    private final static int Tails = 1;
    private final static int SIZE = 5;
    private final static int LITTERSIZE = 10;

    /******** Private Fields ********/
    private int offsprings = 0;
    private String name;
    private int size;
    private String description = "Rabbit";

    /******** Constructor ********/
    public Rabbit(String name) {
        super(name);
        this.size = (int) Math.floor((Math.random() * 10) + SIZE);

        this.flyType = new CantFly();
        this.limbType = new Paw();
        this.mouthPiece = new RodentTeeth();
        this.reproduction = new Viviparous();
    }

    /******** capabilities ********/
    /******************************/

    /******* Implements Prey *******/
    @Override
    public void scurry() {
        System.out.println("Rabbit --> Scurried away with all its strength");
    }

    @Override
    public void hide() {
        System.out.println("Rabbit --> Hides in a hole, and is hard to find");
    }

    /******* Implements paw *******/
    public void dig() { ((Paw)limbType).dig(); }
    public void slap(){ ((Paw)limbType).slap(); }

    /******* override super class *******/
    @Override
    public void flee() {
        scurry();
    }

    @Override
    public void reproduce(){
        reproduction.reproduce();
        reproduction.setOffspring((int)Math.floor((Math.random() * LITTERSIZE) + 1));
    }



    /******* Getters *******/
    public static int getEYE() {
        return EYE;
    }

    public static int getLEG() {
        return LEG;
    }

    public static int getTails() {
        return Tails;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public static int getLITTERSIZE() {
        return LITTERSIZE;
    }

    public int getOffsprings() {
        return offsprings;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    /******* Getters *******/

    @Override
    public String toString() {
        return "Rabbit{" +
                "offsprings=" + offsprings +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", description='" + description + '\'' +
                '}';
    }
}
