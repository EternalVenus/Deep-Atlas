public class Kangaroo extends Animal{
    private final static int EYE = 2;
    private final static int LEG = 2;
    private final static int SIZE = 3;
    private int joey = 0;
    private boolean isFemale;

    private String name;
    private int size;
    private String description = "Kangaroo";

    public Kangaroo(String name){
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
        if(Math.random() <= .5){
            isFemale = true;
        }else{
            isFemale = false;
        }
    }

    public void mate(){
        String mate;
        if (joey == 0){
            if(isFemale){
                mate = "Bucks";
            }else{
                mate = "Does";
            }
            System.out.println("Kangaroo looks for a " + mate);
            ++joey;
            System.out.println("Joey is here.");
        }else{
            System.out.println("Joey is already here. ");
        }
    }

    public void secretAttack(){
        System.out.println("Joey Leaps out and attack");
    }

    private void punch(){
        System.out.println("Kangaroo --> Punches forward");
    }

    private void kick(){
        jump();
        System.out.println("Kangaroo --> Kicks forward");
    }

    private void jump(){
        System.out.println("Kangaroo --> Leaps into the air.");
    }

    private void tripod(){
        System.out.println("Kangaroo --> use its tail to form a tripod with its two forelimbs.");
    }

    private void crawlWalking(){
        tripod();
        System.out.println("Kangaroo --> Raises its hind legs forward.");
        jump();
    }


    /******* Override ********/
    @Override
    public void attack() {
        punch();
        kick();
    }

    @Override
    public void defend() {
        punch();
        kick();
    }

    @Override
    public void move() {
        crawlWalking();
    }

    @Override
    public void eat() {
        System.out.println("Kangaroo --> Feeds Joey");
    }

    /******* Override ********/

    public static int getEYE() {
        return EYE;
    }

    public static int getLEG() {
        return LEG;
    }

    public void getJoey() {
        if(joey ==1 && this.isFemale == true){
            System.out.println("Joey is currently inside the pouch.");
            secretAttack();
        }else{
            System.out.println("There is no Joey here.");
        }
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
    /******* Getters ********/

    public String toString(){
        return this.description;
    }
}
