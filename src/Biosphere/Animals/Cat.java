package Biosphere.Animals;

import Animals.Abstracts.Hunters;
import Animals.Interfaces.*;

public class Cat extends Hunters implements SharpClaw, HasPaw, Viviparous, SharpTeeth{
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
    private String description = "Cat";

    /******** Constructor ********/
    public Cat(String name) {
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
    }

    /******** capabilities ********/
    /******************************/

    /******* Implements Hunters *******/
    protected void Stalk(){
        System.out.println("Cat --> Stalks the pray");
    }

    protected void Strike(){
        System.out.println("Cat --> Strikes the pray");
    }

    /******* Implements Viviparous *******/
    public void giveBirth(){
        offsprings += (int)Math.floor((Math.random() * LITTERSIZE) + 1);
    }

    /******* Implements HasPaw *******/
    public void dig(){     System.out.println("Cat --> Digging hole on the soft ground");  }
    public void slap(){    System.out.println("Cat --> Slapping with its paw");            }

    /******* Implements SharpClaw *******/
    public void scratch(){ System.out.println("Cat --> Scratching the enemy");             }
    public void slash(){   System.out.println("Cat --> Slashing the enemy");               }
    public void climb(){   System.out.println("Cat --> climbing with its claws");          }

    /******* Implements SharpTeeth *******/
    public void bite(){ System.out.println("Cat --> Bites the target"); }
    public void tear(){ System.out.println("Cat --> Tear flesh with its teeth"); }

    /******* Override *******/
    @Override
    public void attack() {
        scratch();
    }

    @Override
    public void defend() {
        System.out.println("Cat --> Curl up in a ball.");
    }

    @Override
    public void eat() {
        System.out.println("Cat --> Eat with its mouth.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat --> Says Meow.");
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