package Biosphere.Animals;

public interface Reproduction {
    void description();
    void reproduce();
    int getOffspring();
    void setOffspring(int offspring);
}

class Oviparous implements Reproduction {

    private int offSpring = 0;

    @Override
    public void description() {
        System.out.println("It lays eggs");
    }

    @Override
    public void reproduce() {
        System.out.println("It lays eggs");
    }

    @Override
    public int getOffspring() { return offSpring; }

    @Override
    public void setOffspring(int offspring){ this.offSpring = offspring; }
}

class Viviparous implements Reproduction {

    private int offspring = 0;

    @Override
    public void description() {
        System.out.println("It keeps its fetus in the womb");
    }

    @Override
    public void reproduce() {
        System.out.println("It gives births");
    }

    @Override
    public int getOffspring() { return offspring; }

    @Override
    public void setOffspring(int offspring) { this.offspring = offspring; }
}
