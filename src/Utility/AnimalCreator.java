package Utility;

import Biosphere.Animals.*;

public class AnimalCreator {

    public Animal makeNewAnimal(String animalType){
        Animal animal = null;
        switch (animalType){
            case "Cat": {
                animal = new Cat("Random name");    //need to implement a randomName class
                break;
            }
            case "Dog": {
                animal = new Dog("Random name");
            }
            /********* add more cases here *********/
            /***************************************/

            default: {
                System.out.println("The animal specified cannot be instantiated");
            }
        }
        return animal;
    }

}
