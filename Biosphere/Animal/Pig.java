/*
    This is an class template to model an animal class.
    This class will extend Animal class but other classes should 
        extend other super class accordingly.
    This class should implement appropiate interface(s) 
        eg HasClaw, Armored, Toxic etc
    The class should contain Static variables such as numbers of eyes,limb etc,
        the basic trait of the animal that is same across all animal of this class.
*/


public class Pig extends Animal{
    private final static int EYE = 2;
    private final static int LEG = 4;
    private final static int SIZE = 30;
    
    private String name;
    private int size;
    private String description = "Pig";

    public Pig(String name){
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
    }
    /******* Getters ********/ 
    public String getName(){
        return this.name;
    }
    
    //Add more getters here
    
    /******* Getters ********/ 
    
    public String toString(){
       return this.description;
    }
}