package Biosphere.Animals;
/**********
 * This might need to be changed to a more general type for example carnivore/herbivore
 * The name are pretty cringe too
 ***********/
public interface Mouth {
    void description();
    void bite(Animal self, Animal target);
}

class CarnivoreTeeth implements Mouth {
    @Override
    public void description() {
        System.out.println("It have sharp teeth");
    }

    @Override
    public void bite(Animal self, Animal target) {
        System.out.println(self.getName() + " bites " + target.getName() + " with its sharp teeth");
    }

    public void tear(Animal self, Animal target) {
        System.out.println("It tears flesh with its teeth");
    }

    public void crush(Animal self, Animal target) {
        System.out.println("It crushed small bones with its jaw strength");
    }
}

class HerbivoreTeeth implements Mouth {
    @Override
    public void description() {
        System.out.println("It have large, grinding teeth");
    }

    @Override
    public void bite(Animal self, Animal target) {
        System.out.println(self.getName() + " bites " + target.getName() + " with its flat teeth");
    }

    public void chew() {
        System.out.println("It chews with its grinding molar");
    }
}

class Beak implements Mouth {
    @Override
    public void description() {
        System.out.println("It have a hard, pointed beak");
    }

    @Override
    public void bite(Animal self, Animal target) {
        System.out.println("It bites with its beak");
    }

    public void peck() {
        System.out.println("It thrust its pointy beak forward");
    }
}

class Fang implements Mouth {
    @Override
    public void description() {
        System.out.println("It have two long needle-sharp fangs");
    }

    @Override
    public void bite(Animal self, Animal target) {
        System.out.println("It strikes quickly with its fangs");
    }
}

class RodentTeeth implements Mouth {
    @Override
    public void description() {
        System.out.println("It's got two pair of incisor at front it can chew through many materials");
    }

    @Override
    public void bite(Animal self, Animal target) {
        System.out.println("It nibbles on the target with its teeth.");
    }
}
