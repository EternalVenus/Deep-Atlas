package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Hunter;

public class Tiger extends Animal implements Hunter {
    private final static int EYE = 2;
    private final static int LEG = 4;
    private final static int PAW = 4;
    private final static int SIZE = 40;

    private String name;
    private int size;
    private String description = "Tiger";
    private boolean isNight = false;
    private int cub;

    public Tiger(String name){
        super(name);
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);

        this.flyType = new CantFly();
        this.limbType = new SharpClaws();
        this.mouthPiece = new CarnivoreTeeth();
        this.reproduction = new Viviparous();
    }

    public void reproduce(){
        reproduction.reproduce();
        cub += (3 + (int)(Math.random() * (5)));
        System.out.println("There are now " + cub + " cubs");
    }

    @Override
    public void Stalk() {
        System.out.println(name + " following it's prey in shadow");
    }

    @Override
    public void Strike() {
        pounce();
    }

    public void scratch(){
        ((SharpClaws)limbType).scratch();
    }

    public void pounce(){ System.out.println(name + " lunge itself onto the victim."); }

    public void leap(){
        System.out.println("Jumped more than 20 feet.");
    }

    public void slash(){ ((SharpClaws)limbType).slash(); }

    public void stalk(){
        System.out.println("Slowly creep up to a prey behind bushes.");
    }

    public void dash(){
        System.out.println("Short speed burst of 50 miles per hour.");
    }

    private void acuteHearing(){
        System.out.println("The traits of a hunter, detecting prey in the distance.");
    }

    private void camouflage(){
        System.out.println("Using its fur to avoid detection.");
    }

    private void huntingTactic(){
        System.out.println("Holding down its prey using forelimbs and bite their throats.");
    }

    @Override
    public void attack() {
        leap();
        pounce();
        scratch();
        slash();
    }

    @Override
    public void defend() {
        camouflage();
    }

    @Override
    public void eat() {
        pounce();
    }

    //@Override
    public void flee() {
        dash();
    }

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

    public static int getPAW() {
        return PAW;
    }

    public int getSize() {
        return size;
    }

    //Add more getters here

    /******* Getters ********/

    public String toString(){
        return this.description;
    }
}
