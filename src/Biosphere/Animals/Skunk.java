package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Scavenger;

public class Skunk extends Animal implements scavenger{
    private final static int EYE = 2;
    private final static int LEG = 2;
    private final static int TAIL = 1;
    private final static int SIZE = 10;

    private String name;
    private int size;
    private String description = "Skunk";
    private String[] foodList = {"lizard", "frog", "eggs", "garbage", "beetles", "earthworm"};
    private String[] foodList2 ={"acorn", "fruit", "berry", "larvae","bird"};
    private int kits;


    public Skunk(String name){
        super(name);
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);

        this.flyType = new CantFly();
        this.limbType = new Paw();
        this.mouthPiece = new HerbivoreTeeth();
        this.reproduction = new Viviparous();
    }

    public void reproduce(){

        this.kits += (4 + (int)(Math.random() * (4)));
        System.out.println("There are " + this.kits + " kits.");
        System.out.println("The mother will stay inside for 6 weeks and teach them how to hunt.");
    }

    public void gasAttack(){
        System.out.println(name + " sprays a foul smelling odor.");
    }


    public void scratchComboAttack() {
        if (kits > 0) {
            System.out.println("The mother and kits all scratch at once.");
        } else {
            System.out.println("There are no kits for the combo attack.");
        }
    }

    public void scratch(){
        System.out.println(name + " uses its long claw to scratch.");
    }


    private void curl(){
        System.out.println(name + " curls up into a ball.");
    }

    private void scurry(){
        System.out.println(name + " quickly run to another position");
    }

    private void scavenge(){
        int randomIndex = (int)(Math.random() * ((foodList.length) + 1));
        String foundMeal = foodList[randomIndex];

        System.out.println("Digging the ground in search of food.");
        System.out.println(name + " has found a " + foundMeal);
    }

    private void scavengeTree(){
        int randomIndex = (int)(Math.random() * ((foodList2.length) + 1));
        String foundMeal = foodList2[randomIndex];

        System.out.println("Climbing a tree to find a meal.");
        System.out.println(name + " has found a " + foundMeal);
    }


    /******* Override ********/
    @Override
    public void attack() {
        if(this.kits > 0){
            scratchComboAttack();
        }else{
            scratch();
            gasAttack();
        }
    }

    @Override
    public void flee() {
        gasAttack();
        scurry();
    }

    @Override
    public void flee() {
        scurry();
    }

    @Override
    public void defend() {
        gasAttack();
        curl();
    }

    @Override
    public void move() {
        scurry();
    }

    @Override
    public void eat() {
        scratch();
        if(Math.random() < .5){
            scavenge();
        }else{
            scavengeTree();
        }
        System.out.println("Eating the food that it found.");
    }

    /************************/


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

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public static int getTAIL() {
        return TAIL;
    }

    public String[] getFoodList() {
        return foodList;
    }

    public String[] getFoodList2() {
        return foodList2;
    }

    public int getKits() {
        return kits;
    }

    /**************************/


    public String toString(){
        return this.description;
    }
}
