package Biosphere.Animals;

import Biosphere.Animals.Abstracts.Hunter;

public class Tiger extends Hunter {
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
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
    }

    public void reproduce(){
        cub += (3 + (int)(Math.random() * (5)));
        System.out.println("There are now " + cub + " cubs");
    }

    public void feedCubs(){
        if(cub > 0){
            comboPounce();
            comboSlash();
        }else{
            System.out.println("There are no cubs to feed.");
        }
    }

    @Override
    protected void Stalk() {
        System.out.println(name + " following it's prey in shadow");
    }

    @Override
    protected void Strike() {
        pounce();
    }

    public void scratch(){
        System.out.println("Scratch using its strong claws.");
    }

    public void pounce(){
        System.out.println(name + " lunge itself onto the victim.");
    }

    public void comboPounce(){
        if (cub > 0) {
            System.out.println("The streak of tigers all lunge at once.");
        }else{
            System.out.println("There is only one tiger. Combo pounce can't be used.");
        }
    }

    public void leap(){
        System.out.println("Jumped more than 20 feet.");
    }

    public void slash(){
        System.out.println("Using its front legs to give a powerful slash.");
    }

    public void comboSlash(){
        if (cub > 0) {
            System.out.println("The streak of tigers all slash at once.");
        }else{
            System.out.println("There is only one tiger. Combo Slash can't be used.");
        }
    }

    public void sneak(){
        System.out.println("Slowly creep up to a prey behind bushes.");
    }

    public void dash(){
        System.out.println("Short speed burst of 50 miles per hour.");
    }



    private void nightVision(){
        System.out.println("Allowing light to reflect back onto the retina as well as round pupils, \n" +
                                " making it easier to see in the dark.");
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
        if(isNight) {
            nightVision();
        }
        leap();
        pounce();
        scratch();
        slash();
    }

//    @Override
//    public void run() {
//        dash();
//    }

    @Override
    public void defend() {
        if(isNight) {
            nightVision();
        }
        camouflage();
    }

    @Override
    public void eat() {
        if(isNight) {
            nightVision();
        }
        acuteHearing();
        sneak();
        pounce();
        huntingTactic();
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
