public class SeaHorse extends Fish {  // extend means it inherits from Fish class
    private final static int EYE = 2;     
    private final static int SIZE = 1;    
    private String name;
    private int fry; // baby seahorse

    public SeaHorse(String name){
        this.name = name;
        this.size = SIZE + (Math.floor((Math.random() * 13)));

    public void reproduce(){
        fry += 5 + (Math.floor((Math.random() * 1495))); // at least 5 
        System.out.println(fry + "baby puffer fish have been born!");
    }    


    public void hungry(boolean prey){
        if(prey){
          eat();
          System.out.println("seahorse feeds constantly on plankton and tiny fish");
        }else{
          System.out.println("moves each of its eyes independently, so it can follow the activity of passing sea life stealthily.");
        }
    }    
    
    public void matingSeason(boolean mate){
        if(mate){
          System.out.println("To celebrate, seahorses engage in an eight hour courtship dance which includes spinning around, swimming side by side and changing colours.");
          System.out.println("Seahorses are monogamous and mate for life and usually swim in pairs! (awww how cute >.< )")
        }else{
          fight();
        }
    }
    
    public void strongCurrent(boolean plant){
        if(plant){
          root();
        }else{
          System.out.println("Because of their body shape, seahorses are rather inept swimmers and can easily die of exhaustion when caught in storm-roiled seas.")
        }
    }

    public void hide(){
        System.out.println("as a defense mechanism, they hide form predators by mimicing the colors of nearby plants.");
    }
    
    public void fight(){
        System.out.println("To attract a female, males will fight each other by slapping each other with their snouts repeatedly and wrestling with their tails.");
    }
    
    public void root(){
      System.out.println("They anchor themselves with their prehensile tails to sea grasses and corals");
    }    
    
    public void eat(){
      System.out.println("Seahorses have no teeth and no stomach. Food passes through their digestive systems so quickly, they must eat almost constantly to stay alive."); 
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


