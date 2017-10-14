package Biosphere.Animals;

import Animals.Abstracts.Fighter;
import Animals.Interfaces.*;

public class Dog extends Fighter implements HasPaw, Viviparous, SharpTeeth{
    /******** Static Fields ********/
    private final static int EYE = 2;
    private final static int LEG = 4;
    private final static int SIZE = 15;
    private final static int Paws = 4;
    private final static int LITTERSIZE = 4;

    /******** Private Fields ********/
    private int offsprings = 0;
    private String name;
    private int size;
    private String description = "Dog";

    /******** Constructor ********/
    public Dog(String name) {
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 15) + SIZE);
    }

    /******** capabilities ********/
    /******************************/

    /******* Implements Fighter *******/
    @Override
    protected void Charge() {
        System.out.println("Dog --> Charges at its target");
    }

    @Override
    protected void Thrash() {
        System.out.println("Dog --> Desparatly thrashes around");
    }

    /******* Implements Viviparous *******/
    public void giveBirth(){
        offsprings += (int)Math.floor((Math.random() * LITTERSIZE) + 1);
    }


    /******* Implements HasPaw *******/
    public void dig(){     System.out.println("Dog --> Digging hole on the soft ground");  }
    public void slap(){    System.out.println("Dog --> Slapping with its paw");            }

    /******* Implements SharpTeeth *******/
    public void bite(){ System.out.println("Dog --> Bites the target"); }
    public void tear(){ System.out.println("Dog --> Tear flesh with its teeth"); }

    /******* Override *******/
    @Override
    public void attack() {
        bite();
    }

    @Override
    public void defend() {
        System.out.println("Dog --> Curl up in a ball.");
    }

    @Override
    public void eat() {
        System.out.println("Dog --> Eat with its mouth.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog --> Says Woof.");
    }
    /******* Override *******/

    /******* Getters *******/
    public static int getEYE() {
        return EYE;
    }

    public static int getLEG() {
        return LEG;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public static int getPaws() {
        return Paws;
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

    public String getDescription() {
        return description;
    }

}