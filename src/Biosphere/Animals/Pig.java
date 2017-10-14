package Biosphere.Animals;

import Animals.Abstracts.Animal;
import Animals.Interfaces.*;

/*
    This is an example class to model an animal.
    This class will extend Animals.Abstracts.Animals class but other classes should
        extend other super class accordingly.
    This class should implement appropiate interface(s) for capabilities
        eg HasClaw, Flyer, Venomous etc
    The class should contain Static variables such as numbers of eyes,limb etc,
        the basic trait of the animal that is same across all animal of this class.
*/

public class Pig extends Animal implements Viviparous{
    /******** Static Fields ********/
    private final static int EYE = 2;
    private final static int LEG = 4;
    private final static int Tails = 1;
    private final static int SIZE = 30;
    private final static int LITTERSIZE = 10;

    /******** Private Fields ********/
    private int offsprings = 0;
    private String name;
    private int size;
    private String description = "Pig";

    /******** Constructor ********/
    public Pig(String name){
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
    }

    /******** capabilities ********/
    /******************************/

    /******* Implements Viviparous *******/
    public void giveBirth(){
        offsprings += (int)Math.floor((Math.random() * LITTERSIZE) + 1);
    }

    /******* Override ********/
    @Override
    public void attack() {
        System.out.println("Pig --> Charging at target.");
    }

    @Override
    public void defend() {
        System.out.println("Pig --> Curling up.");
    }

    @Override
    public void eat() {
        System.out.println("Pig --> Eat with its mouth.");
    }

    @Override
    public void makeSound() {
        System.out.println("Pig --> Says Oink.");
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

    public int getOffsprings() {
        return offsprings;
    }

    public int getSize() {
        return size;
    }
    /******* Getters ********/
    
    public String toString(){
       return this.description;
    }
}