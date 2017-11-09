import Hydrosphere.SeaCreatures.Fish.Fish;

public class ElectricEel extends Fish
    private final static int EYE = 2;
    private final static int LENGTH = 6
    private long timeSeconds = 0;
    boolean dive = true; 
    private int prey;
    private String name;
    private int length;
    private int elver;
        
    public ElectricEel(String name){
    this.name = name;
    this.Reproduction = new Oviparous;
    this.length = LENGTH + (Math.floor((Math.random() * 3)));
    this.prey = Math.floor(Math.random() * 10);
    
    
    @Override
    public void reproduce(){
        super.reproduce(); // calls reproduce method in Fish class which then in turn refers to the one in Reproduction class
        fry = reproduction.setBabies(1300) + (Math.floor(Math.random() * reproduction.setBabiesMultiplier(600)));
         // at least 1300 but at most 1900
        System.out.println(fry + "baby eels have been born!");
    }   
    
    public void dive() {
        long timeDifference;
        System.out.println("The eel has submerged back into the depths");
        timeSeconds = System.currentTimeMillis();
        timeSeconds = TimeUnit.MILLISECONDS.toSeconds(timeSeconds); // convert to seconds
        while (dive) {
            timeDifference = System.currentTimeMillis();
            timeDifference = TimeUnit.MILLISECONDS.toSeconds(timeDifference); // convert to seconds
            if ((timeDifference - timeSeconds) > 3600) { // if one minute has passed
                breath();
                dive = false;
            }
        }
    }
    
    public void breath(){
        System.out.println("The eel rises to take in oxygen!")
        dive = true;
    }
    
    public void radar(){
        System.out.println("The eel emits a low level charge to locate prey")
        System.out.println("The electric shock makes nearby fishes convoluse which gives away their position")
    }
    
    
    public void search(){
        if (prey > 7){
            eat();
        } else {
            radar();
            swim();
        }
    }
    
    public void discharge() {
        System.out.println("The eel discharges electricity to ward of predators");
        timeSeconds = System.currentTimeMillis();
        timeSeconds = TimeUnit.MILLISECONDS.toSeconds(timeSeconds);
        while (true) {
            timeDifference = System.currentTimeMillis(); // compares current time to what was recorded before
            timeDifference = TimeUnit.MILLISECONDS.toSeconds(timeDifference);
            if (timeDifference - timeSeconds > 10) {         // if more than 10 seconds has passed
                System.out.println("The eel curls up to make its discharge more powerful");
                break;
            }
        }
    }


    
        /*------------------------- Getters ---------------------------*/
    public String getName(){
        return name;
    }

    public static int getEYE() {
        return EYE;
    }

    public static int getLength() {
        return length;
    }

