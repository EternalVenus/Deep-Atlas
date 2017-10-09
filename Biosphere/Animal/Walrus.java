public class Walrus extends Animal{

    private final static int EYE = 2;
    private final static int TAIL = 1;
    private final static int SIZE = 40;
    private final static int FLIPPER = 4;

    private String name;
    private int size;
    private String description = "Walrus";
    private String[] foodList = {"clams", "sea cucumber", "gastropod", "shrimp", "coral","crab","fish"};
    private int herdSize = 0;


    public Walrus(String name){
        this.name = name;
        this.size = (int)Math.floor((Math.random() * 10) + SIZE);
    }

    public void bodySlam(){
        rush();
        System.out.println("Throws entire body onto its target.");
    }

    public void comboSlam(){
        if (herdSize == 0){
            System.out.println("Can't use comboSlam with only one walrus.");
        }else{
            System.out.println(this.herdSize + " walruses all slams onto its target.");
        }
    }

    public void swim(){
        dive();
        System.out.println("Using its flippers to navigate through the water.");
    }

    public void lookForHerd(){
        herdSize +=(int)Math.floor(Math.random() * 10);
        System.out.println("There are now " + herdSize + " walruses in the herd.");
    }

    private void dive(){
        System.out.println("Jumps off the cliff and into the cold water.");
    }

    private void rush(){
        System.out.println("Quickly charges forward");
    }

    private void dominance(){
        System.out.println("Displays dominance by showing their body and tusk.");
    }
    private void tuskAttack(){
        System.out.println("Attach with its long tusk.");
    }
    private void seekingFood(){
        int randomIndex = (int)(Math.random() * (foodList.length));
        String foundMeal = foodList[randomIndex];
        dive();
        swim();

        System.out.println(name + " has found a " + foundMeal);
    }


    /******* Override ********/
    @Override
    public void attack() {
        bodySlam();
        tuskAttack();
    }

    @Override
    public void flee() {
        lookForHerd();
    }

    @Override
    public void run() {
        rush();
    }

    @Override
    public void defend() {
        dominance();
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {
        seekingFood();
    }

    /************************/


    /******* Getters ********/
    public static int getEYE() {
        return EYE;
    }

    public static int getTAIL() {
        return TAIL;
    }

    public static int getFLIPPER() {
        return FLIPPER;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    /**************************/


    public String toString(){
        return this.description;
    }

}
