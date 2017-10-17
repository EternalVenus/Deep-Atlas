package Biosphere.Animals;

import Biosphere.Animals.Interfaces.Prey;

public class Squirrel extends Prey {
    private final static int EYE = 2;
    private final static int LEG = 2;
    private final static int ARM = 2;
    private final static int TAIL = 1;
    private final static int SIZE = 3;

    private String name;
    private int size;
    private String description = "Squirrel";

    private boolean isAsleep;
    private int acorn = 0;

    public Squirrel(String name){
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
        this.isAsleep = false;
    }

    public void gatherNuts(){
        if(isAsleep){
            System.out.println(name + " is currently sleeping. You have to wake him up (wakeUp)");
        }else{
            if(acorn > 100){
                System.out.println("Too many acorns. Not enough space to put them.");
            }else{
                System.out.println(name + " searches around for acorns.");
                int foundAcorns = (int)Math.floor((Math.random() * 5) + 1);
                System.out.println("Found " + foundAcorns);
                acorn += foundAcorns;
                System.out.println( name + " has " + acorn + " acorns.");
            }
        }
    }

    public void hibernate(){
        if(isAsleep == false){
            if(this.acorn <= 30){
                System.out.println("Not enough acorns to hibernate!!! NEED AT LEAST 30");
                System.out.println(name + " went to find acorns instead.");
                gatherNuts();
            }else{
                curl();
                isAsleep = true;
                System.out.println(name + " went to sleep.");
            }
        }else{
            System.out.println(name + " is already asleep.");
        }
    }

    public void wakeUp(){
        isAsleep = false;
        System.out.println(name + " woke up.");
    }

    private void scratch(){
        System.out.println(name + " Slash forward its claws.");
    }

    private void curl(){
        System.out.println(name + " Rolls into a ball.");
    }

    //implements Prey class
    public void scurry(){
        System.out.println(name + " Quickly run to another position");
    }
    public void hide(){ System.out.println(name + " Hides into a hole"); }

    private void climb(){
        System.out.println(name + " Climbs to the top of a tree.");
    }

    private void findTree(){
        System.out.println(name + " found a tree.");
    }


    /******* Override ********/
    @Override
    public void attack() {
        if(isAsleep){
            System.out.println(name + " is sleeping peacefully. You have to wake him up (wakeUp)");
        }else{
            scratch();
        }
    }

    @Override
    public void defend() {
        if (isAsleep){
            System.out.println(name + " is sleeping. You have to wake him up (wakeUp)");
        }else{
            curl();
        }
    }

    @Override
    public void move() {
        if (isAsleep){
            System.out.println(name + " is currently sleeping. You have to wake him up (wakeUp)");
        }else{
            scurry();
        }
    }

    //@Override
    public void flee() {
        if (isAsleep){
            System.out.println(name + " is sleeping. You have to wake him up (wakeUp)");
        }else{
            scurry();
            findTree();
            climb();
            hide();
        }
    }

    @Override
    public void eat() {
        if(isAsleep){
            System.out.println(name + " is sleeping. You have to wake him up (wakeUp)");
        }else{
            int acornsAte = (int)Math.floor((Math.random() * 3) + 1);
            if(acorn - acornsAte < 0){
                System.out.println("Not enough acorns to eat");
                gatherNuts();
            }else{
                acorn -= acornsAte;
                System.out.println(name + " ate " + acornsAte + " acorns.");
                System.out.println("There are still " + acorn + " left.");
            }
        }
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

    public static int getARM() {
        return ARM;
    }

    public static int getTAIL() {
        return TAIL;
    }

    public int getAcorn() {
        return acorn;
    }
    /**************************/


    public String toString(){
        return this.description;
    }
}