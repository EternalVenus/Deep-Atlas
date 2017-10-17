package Biosphere.Animals;

public interface Limb {
    void description();
}

class noLimb implements Limb {
    @Override
    public void description() {
        System.out.println("It doesn't have limbs");
    }
}

class Paw implements Limb {
    @Override
    public void description() {
        System.out.println("It have paws");
    }

    public void dig() {
        System.out.println("It digs on the soft ground with its paw");
    }

    public void slap(){
        System.out.println("It slaps with its paw");
    }

    public void walk(){
        System.out.println("It walks on its paws");
    }

    public void run(){
        System.out.println("It run on its paws");
    }
}

class SharpClaws extends Paw implements Limb {
    @Override
    public void description() {
        System.out.println("It have paws with sharp claws");
    }

    public void scratch() {
        System.out.println("It scratches with its claws");
    }

    public void slash() {
        System.out.println("It slashes with its claws");
    }

    public void climb() {
        System.out.println("It climbs with its claws");
    }

    public void grab() {
        System.out.println("Its claws digs into flesh");
    }
}

class Hoof implements Limb {
    @Override
    public void description() {
        System.out.println("It have hoofs");
    }

    public void stomp() {
            System.out.println("It stomp target with its hoofs");
    }

    public void kick() {
        System.out.println("It kicks target with its hoofs");
    }

    public void walk() {
        System.out.println("It walks with it hoof");
    }

    public void run() {
        System.out.println("It runs with its hoofs");
    }
}

class Wing implements Limb {
    @Override
    public void description() {
        System.out.println("It have wings");
    }

    public void fly() {
        System.out.println("It flies with its wings");
    }

    public void hover() {
        System.out.println("It hovers in the air with its wings");
    }

    public void dive() {
        System.out.println("It dive down from above");
    }
}

class Hand implements Limb {
    @Override
    public void description() {
        System.out.println("It have oppositable thumbs");
    }

    public void grab () {
        System.out.println("It grabs the target with its fingers");
    }

    public void punch () {
        System.out.println("It punches with its fist");
    }

    public void slap() {
        System.out.println("It slaps with its hand");
    }
}
