public class ClownFish extends Fish {  // extend means it inherits from Fish class
    private final static int EYE = 2;     
    private final static int SIZE = 2;    
    private String name;
    private int fry; // baby fish

    public ClownFish(String name){
        this.name = name;
        this.size = SIZE + (Math.floor((Math.random() * 4)));

    public void reproduce(){
        fry += 400 + (Math.floor((Math.random() * 600))); // at least 400 but at most 1000
        System.out.println(fry + "baby puffer fish have been born!");
    }    


    public void hungry(boolean prey, boolean eggs){
        if(prey){
          eat();
          System.out.println("eats the leftovers left by the sea anemones");
        }else{
          eat();
          System.out.println("The male eats the eggs if its of poor quality or if it becomes infected by a fungus.");
        }
    }

    public void hide(){
        System.out.println("as a defense mechanism, the clown fish hide in the poisonous tentacles of the sea anemones.");
    }
    
    public void genderChange(){
        System.out.println("clown fish are hermaphrodites. Thsi means they are born male and change genders as needed");
    }

    public void rankUp(boolean topFemale, boolean topMale){
        if (topFemale){
            genderChange();
            System.out.println("If the most agressive female dies, the largest male moves up the hierarchy to replace her.");
            System.out.println("The rest of the males move up the hierarchy.");
        }
      
    }    
    
    public void mucus(){
      System.out.println("clown fish secretes mucus from their skins which allows them to interact with the sea anemones.");
    }    
    
    public void symbiosis(){
      System.out.println("The clownfish and the sea anemone help each other survive in the ocean. The clownfish, while being provided with food, cleans away fish and algae leftovers from the anemone."); 
      System.out.println("In addition, the sea anemones are given better water circulation because the clownfish fan their fins while swimming about.");
    }


    /*------------------------- Getters ---------------------------*/
    public String getName(){
        return name;
    }

    public static int getEYE() {
        return EYE;
    }

    public static int getSize() {
        return size;
    }


