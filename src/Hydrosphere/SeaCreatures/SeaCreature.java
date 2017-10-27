package Hydrosphere.SeaCreatures;

public abstract class SeaCreature { // abstract - cannot be instantiated. Only purpose is for other classes to extend
    public void attack(){
        System.out.println("Animal Attack");
    }

    public void flee(){
        System.out.println("Animal escapes");
    }

    public void defend(){
        System.out.println("Animal Defend");
    }

    public void move(){
        System.out.println("Animal Moves");
    }

    public void feedingTime(){
        System.out.println("Animal Eat");
    }

    public void dump(){
        System.out.print("Animal taking a dump");
    }
}
