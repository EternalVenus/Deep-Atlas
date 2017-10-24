package Biosphere.Animals;


public class Animal {
    public String name;

    public void attack(){
        System.out.println("Animals.Interfaces.Animals Attack");
    }
//    public void run(){
//        System.out.println("Animals.Interfaces.Animals run");
//    }
    public void defend(){
        System.out.println("Animal Defend");
    }
    public void move(){
        System.out.println("Animal Moves");
    }
    public void eat(){
        System.out.println("Animal Eats");
    }
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
    public void dump(){
        System.out.println("Animal taking a dump");
    }
    public void flee(){System.out.println("Animal fleeing away"); }

    /******** Use composition to describe animal traits ********/
    protected Limb limbType;
    protected Mouth mouthPiece;
    protected Fly flyType;
    protected Reproduction reproduction;

    /******** Constructor ********/
    public Animal(String name){
        this.name = name;
    }

    /******** Dont know if want to keep or not ********/
    public void fly(){
        flyType.fly();
    }       //consider remove fly as it can be replace by method in Limb::Wing.
    public void limb(){
        limbType.description();
    }
    public void reproduce(){
        reproduction.reproduce();
    }
    public void mouth() { mouthPiece.description(); }

    public String getName(){
        return this.name;
    }


}
    
    