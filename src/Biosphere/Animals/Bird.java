package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Prey;

public class Bird extends Animal implements Prey{
    /******** Static Fields ********/
    private final static int EYE = 2;
    private final static int LEG = 2;
    private final static int SIZE = 3;
    private final static int WING = 2;
    private final static int LITTERSIZE = 5;

    /******** Private Field ********/
//    private int eggsLaid = 0;             **Refactored into reproduction
    private String name;
    private int size;
    private String description = "Bird";

    /********* Constructor *********/
    public Bird(String name){
        super(name);
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);

        this.flyType = new ItFly();             //Birds Flies
        this.limbType = new Wing();             //Birds Have Wings
        this.mouthPiece = new Beak();           //Birds Have Beaks
        this.reproduction = new Oviparous();    //Birds are Oviparous
    }

    /******** capabilities ********/
    /******************************/


//    /******* Implements Oviparous *******/
//    public void layEgg(){
//        buildNest();
//        eggsLaid += (int)Math.floor((Math.random() * LITTERSIZE) + 1);
//        brood();
//    }
//
//    /******* Implements Flyer *******/
//    public void fly(){
//        beat();
//        hover();
//    }
//
//    private void hover(){
//        System.out.println("Bird --> maintaining its position in the air.");
//    }
//
//    private void buildNest(){
//        System.out.println("Bird --> Building a nest for the eggs.");
//    }
//
//    private void beat(){
//        System.out.println("Bird --> Flap its wings multiple times.");
//    }
//
//    private void brood(){
//        System.out.println("Bird --> Sits on top of its eggs until it is born.");
//    }
//
//    private void peck(){
//        System.out.println("Bird --> quickly moves the beak forward.");
//    }



    /******* implements Prey *******/
    public void scurry() {
        System.out.println(name + " --> scurried away in panic.");
    }

    public void hide() {
        System.out.println(name + " --> hides in a tree branch and is hard to find");
    }

    /******* Override ********/
    @Override
    public void reproduce() {
        super.reproduce();
        reproduction.setOffspring(reproduction.getOffspring() +
                                  (int)Math.floor((Math.random() * LITTERSIZE) + 1));
    }

    @Override
    public void flee() {
        System.out.println(name + " flies away");
    }

    @Override
    public void attack() { ((Beak)mouthPiece).peck(); }

    @Override
    public void defend() {
        System.out.println("Bird --> cover itself with its wings.");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void eat() {
        ((Beak)mouthPiece).peck();
    }

    @Override
    public void makeSound() {
        System.out.println(name + " --> Says Chirp.");
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

    public static int getWING() {
        return WING;
    }

    public int getSize() {
        return size;
    }

    public int getEggsLaid() { return reproduction.getOffspring(); }

    public String getDescription() {
        return description;
    }
    /******* Getters ********/

    public String toString(){
        return this.description;
    }
}