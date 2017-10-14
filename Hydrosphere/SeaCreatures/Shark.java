public class Shark extends SeaCreatures {  // extend means it inherits from SeaCreatures class
    private final static int EYE = 2; // final static so it cannot be changed
    private int gills;
    private int teeth = 4;
    private int fins = 40;
    private String name;
    private int length;
    private int weight;
    private String description = "Shark";
    private int pups;


    public void reproduce(){
        pups += Math.floor((Math.random() * 100));
        System.out.println(pups + "pups have been born!");
    }


    public void Hungry(boolean prey){
        if(prey){
          bite();
          dash();
          bump();
          System.out.println("Having been crazed by the smell of blood the shark rips the prey into pieces!");
        }else{
          bite();
          System.out.println("The starving mother consumes her young for food");
        }
    }

    public void bite(){
        System.out.println("The" + name + "has chomped on the victim");
    }

    public void dash(){
        System.out.println("The" + name + "has sped up!");
    }

    public void bump(){
        System.out.println("Uses its head to deliver a jab");
    }

    public void thrash(){
      System.out.println("Having been caught, it struggles to break free");
    }

    public void sneak(){
        System.out.println("The shark stalks its prey");
    }

    private void smell(){
        System.out.println("its nose having been designed solely for tracking, it can detect a single srop of blood in 25 gallons of water");
    }

    private void nightVision(){
        System.out.println("with eyes similar to cats, they can see well in low light");
    }

    private void radar(){
        System.out.println("uses jelly-filled canals in their heads to detect electrical stimuli of animals");
        System.out.println("uses fluid filled vessels under the skin to detect vibrations of struggling prey");
    }

    private void hearing(){
        System.out.println("Sharks are sensative to low frequency sounds");
    }

    @Override
    public void attack() {
        if(isNight) {
            nightVision();
        }
        bite();
        dash();
        bump();
    }

    @Override
    public void move() {
        sneak();
    }

    @Override
    public void defend() {
      thrash();
      dash();
      bite();
    }

    @Override
    public void feedingTime() {
        if(isNight) {
            nightVision();
        }
        sneak();
        radar();
        smell();
        hearing();
    }

    @Override
    public void flee() {
        dash();
    }

    /*------------------------- Getters ---------------------------*/
    public String getName(){
        return name;
    }

    public static int getGills() {
        return gills;
    }

    public static int getTeeth() {
        return teeth;
    }

    public static int getFins() {
        return fins;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

}
