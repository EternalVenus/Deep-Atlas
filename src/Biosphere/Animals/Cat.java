package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Hunter;

public class Cat extends Animal implements Hunter{
    /******** Static Fields ********/
    private final static int EYE = 2;
    private final static int LEG = 4;
    private final static int SIZE = 15;
    private final static int Paws = 4;
    private final static int LITTERSIZE = 4;

    /******** Private Fields ********/
    private int offsprings = 0;
    private int size;
    private String description = "Cat";

    /******** Constructor ********/
    public Cat(String name) {
        super(name);
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);

        this.flyType = new CantFly();           //Cat cant fly
        this.limbType = new SharpClaws();       //Cat have paw with sharpClaw
        this.mouthPiece = new CarnivoreTeeth(); //Cat have teeth for carnivores
        this.reproduction = new Viviparous();   //Cat are viviparous
    }

    /******** capabilities ********/
    /******************************/

    /******* Implements Hunter *******/
    public void Stalk(){
        System.out.println(name + " --> Stalks the pray");
    }

    public void Strike(){
        System.out.println(name + " --> Strikes the pray");
    }

    /******* Implements Viviparous *******/
    public void reproduce(){
        reproduction.reproduce();
        reproduction.setOffspring((int)Math.floor((Math.random() * LITTERSIZE) + 1));
    }

    /******* Implements SharpClaw *******/
    public void dig(){ ((SharpClaws)limbType).dig(); }
    public void slap(){ ((SharpClaws)limbType).slap(); }
    public void scratch(){ ((SharpClaws)limbType).scratch(); }
    public void slash(){ ((SharpClaws)limbType).slash(); }
    public void climb(){ ((SharpClaws)limbType).climb(); }

    /******* Implements SharpTeeth *******/
    public void bite(){ System.out.println("Cat --> Bites the target"); }
    public void tear(){ System.out.println("Cat --> Tear flesh with its teeth"); }

    /******* Override *******/
    @Override
    public void attack() {
        ((SharpClaws)limbType).scratch();
    }

    @Override
    public void defend() {
        System.out.println("Cat --> Curl up in a ball.");
    }

    @Override
    public void eat() {
        mouthPiece.bite(this,new Bird("Victm"));
    }

    @Override
    public void makeSound() {
        System.out.println(name + " --> Says Meow.");
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

    public int getOffsprings() { return reproduction.getOffspring(); }

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