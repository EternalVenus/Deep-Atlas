public class ElectricEel extends Fish 
    private final static int EYE = 2;
    private final static int LENGTH = 6
    private int timer = 0;
    boolean dive = true; 
    private String name;
    private int length;
    private int elver;
        
    public ElectricEel(String name){
    this.name = name;
    this.length = LENGTH + (Math.floor((Math.random() * 3)));
    
    public void reproduce(){
        elver += 1300 + (Math.floor((Math.random() * 600))); // at least 1300 
        System.out.println(elver + "baby eels fish have been born!");
    }  
    
    public void dive(){
        System.out.println("The eel has submerged back into the depths")  
        private long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
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