package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Fighter;

public class Kangaroo extends Animal implements Fighter{
    private final static int EYE = 2;
    private final static int LEG = 2;
    private final static int SIZE = 3;
    private int joey = 0;
    private boolean isFemale;

    private String name;
    private int size;
    private String description = "Kangaroo";

    public Kangaroo(String name){
        super(name);
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
        this.isFemale= Math.random() <= 0.5;

        this.flyType = new CantFly();
        this.limbType = new FreeForeLimb();
        this.limbType = new Paw();              //Maybe need a array for multiple types of limb or a class that combines
        this.reproduction = new Viviparous();
        this.mouthPiece = new HerbivoreTeeth();
    }

    public void mate(){
        String mate;
        if (joey == 0 && isFemale){
            if(isFemale){
                mate = "Bucks";
            }else{
                mate = "Does";
            }
            System.out.println("Kangaroo looks for a " + mate);
            ++joey;
            System.out.println("Joey is here.");
        }else{
            System.out.println("Time to look for a does.");
        }
    }

    /******* Override ********/
    @Override
    public void attack() {
        limbType.punch();
        limbType.kick();
    }

    @Override
    public void defend() {
    }

    @Override
    public void eat() {
        if(isFemale){
            System.out.println("Kangaroo --> Feeds Joey");
        }else{
            System.out.println("Kangaroo eats by itself. No Joey :(");
        }
    }

    @Override
    public void Charge() {
        System.out.println(name + " jumps sraight toward its target");
    }

    @Override
    public void Thrash() {
        System.out.println(name + " jumps around kicking everything");
    }

    /******* Override ********/

    public static int getEYE() {
        return EYE;
    }

    public static int getLEG() {
        return LEG;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
    /******* Getters ********/

    public String toString(){
        return this.description;
    }
}
