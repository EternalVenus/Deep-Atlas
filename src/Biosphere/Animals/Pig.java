package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Prey;

/*
    This is an example class to model an animal.
    This class will extend Animals.Interfaces.Animals class but other classes should
        extend other super class accordingly.
    This class should implement appropriate interface(s) for Behaviors and special moves??
        eg Hunter, Fighter, Prey etc
    The class should contain Static variables such as numbers of eyes,limb etc,
        the basic trait of the animal that is same across all animal of this class.
    The class will have a sets of encapsulated traits such as Claws, hoofs, wings etc
        each of these trait will be a class of its own, and implements a general interface

*/

public class Pig extends Animal implements Prey{
    /******** Static Fields ********/
    private final static int EYE = 2;
    private final static int LEG = 4;
    private final static int Tails = 1;
    private final static int SIZE = 30;
    private final static int LITTERSIZE = 10;

    /******** Private Fields ********/
    //private int offsprings = 0;
    //private String name;
    private int size;
    private String description = "Pig";


    /******** Constructor ********/
    public Pig(String name){
        super(name);
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);

        this.flyType = new CantFly();
        this.mouthPiece = new HerbivoreTeeth();
        this.reproduction = new Viviparous();
        this.limbType = new Hoof();
    }

    /******** capabilities ********/
    /******************************/

    /******* Implements Prey *******/
    @Override
    public void scurry() {
        System.out.println(name + "Ran away in panic.");
    }

    @Override
    public void hide() {
        System.out.println(name + " tries to hide, but can't cover it self");
    }

    /******* Override ********/
    @Override
    public void move() { System.out.println(name + " Moves slowly"); }

    @Override
    public void attack() { mouthPiece.bite(this, new Animal("Victim")); }

    @Override
    public void defend() {
        System.out.println(name + " --> Curling up.");
    }

    @Override
    public void eat() {
        System.out.println(name + " --> Eat with its mouth.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " --> Says Oink.");
    }

    @Override
    public void reproduce(){
        super.reproduce();
        reproduction.setOffspring(reproduction.getOffspring() +
                (int)Math.floor((Math.random() * LITTERSIZE) + 1));
    }

    /******* Override ********/



    /******* Getters ********/ 
    public String getName(){
        return this.name;
    }

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

    public int getOffsprings() { return reproduction.getOffspring(); }

    public int getSize() {
        return size;
    }
    /******* Getters ********/
    
    public String toString(){
       return this.description;
    }
}