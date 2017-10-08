public class Bird extends Animal{
    private final static int EYE = 2;
    private final static int LEG = 2;
    private final static int SIZE = 3;
    private final static int WING = 2;
    private int eggsLaid = 0;

    private String name;
    private int size;
    private String description = "Bird";

    public Bird(String name){
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
    }

    public void laidEgg(){
        buildNest();
        eggsLaid += (int)Math.floor((Math.random() * 5) + 1);
        brood();
    }


    public void fly(){
        beat();
        hover();
    }

    private void hover(){
        System.out.println("Bird --> maintaining its position in the air.");
    }

    private void buildNest(){
        System.out.println("Bird --> Building a nest for the eggs.");
    }

    private void beat(){
        System.out.println("Bird --> Flap its wings multiple times.");
    }

    private void brood(){
        System.out.println("Bird --> Sits on top of its eggs until it is born.");
    }
    
    private void peck(){
        System.out.println("Bird --> quickly moves the beak forward.");
    }


    /******* Override ********/
    @Override
    public void attack() {
        peck();
    }

    @Override
    public void defend() {
        System.out.println("Bird --> cover itself with its wings.");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void eat() {
        peck();
    }
    /******* Override ********/


    /******* Getters ********/
    public String getName(){
        return this.name;
    }

    public static int getEYE() {
        return EYE;
    }

    public static int getLEG() {
        return LEG;
    }

    public static int getWING() {
        return WING;
    }

    public int getSize() {
        return size;
    }

    public int getEggsLaid() {
        return eggsLaid;
    }

    public String getDescription() {
        return description;
    }
    /******* Getters ********/

    public String toString(){
        return this.description;
    }
}