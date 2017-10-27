package Biosphere.Animals;

public interface Fly {
    void fly();
}

class ItFly implements Fly {
    @Override
    public void fly() {
        System.out.println("it Flys");
    }
}

class CantFly implements Fly {
    @Override
    public void fly() {
        System.out.println("It Can't Fly");
    }
}

class Glide implements Fly {
    @Override
    public void fly() {
        System.out.println("It glides through the air");
    }
}

class Float implements Fly {
    @Override
    public void fly() {
        System.out.println("It floats and go with the wind");
    }
}