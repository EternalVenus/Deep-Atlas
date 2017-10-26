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
    this.length = LENGTH + (Math.floor((Math.random() * 3)));
    this.prey = Math.floor(Math.random() * 10);
    
    public void reproduce(){
        elver += 1300 + (Math.floor((Math.random() * 600))); // at least 1300 
        System.out.println(elver + "baby eels fish have been born!");
    }  
    
    public void dive(){
        System.out.println("The eel has submerged back into the depths")  
        timeSeconds = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
        while(dive){
            if (timeSeconds > 3600){
                breath();
                dive = false;
            } else{
                System.out.println("The eel dies")
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
    
    public void discharge{
        System.out.println("The eel discharges electricity to ward of predators")
        timeSeconds = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
        if (timeSeconds > 10){
            System.out.println("The eel curls up to make its discharge more powerful")
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
