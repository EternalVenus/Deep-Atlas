/*
    This is an class template to model an animal class.
    This class will extend Animal class but other classes should 
        extend other super class accordingly.
    This class should implement appropiate interface(s) 
        eg HasClaw, Armored, toxic etc
    The class should contain Static variables such as numbers of eyes,limb etc,
        the basic trait of the animal that is same across all animal of this class.
      
    
    
*/


public class Pig extends Animal{
    static final int EYE = 2;
    static final int LEG = 4;
    static final int SIZE = 30;
    
    private String name;
    private int size;
    private String description = "Pig";

    public Pig(String name){
        this.name = name;
        this.size = Math.floor((Math.random() * 10) + SIZE);
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
       return this.description;
    }
}