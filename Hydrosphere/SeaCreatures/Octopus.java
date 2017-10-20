public class Octopus extends SeaCreatures {  // extend means it inherits from SeaCreatures class
    private final static int EYE = 2;
    private final static int ARM = 2;     
    private final static int WEIGHT = 2; 
    private final static int LEG = 6; // final static so it cannot be changed
    private String name;
    private int length;
    private boolean camoflauge; // can it camoflauge? 
    private int larvae; // baby octopus

    public Octopus(String name, boolean camoflauge)
        this.name = name;
        this.length = 2 + Math.floor((Math.random() * 20));
        this.weight = length * WEIGHT;
        this.camoflauge = camoflauge;

    public void reproduce(){
        larvae += 1000 + (Math.floor((Math.random() * 1000)));
        System.out.println(larvae + "larvae have been born!");
    }


    public void Hungry(boolean prey){
        if(prey){
          suction();
          aquaJet();
          beak();
          System.out.println("meal time!");
        }else if (larve > 0) {
          motherOfTheYear();
          System.out.println("The starving mother continues to starve in order to care for her young.");
        }
        else if (camoflauge){
            System.out.println("The" + name + "waits for a passing prey.")
        }
        else {
            aquaJet();
            System.out.println("The" + name + "searches for food")
        }
    }

    public void suction(){
        System.out.println("using its tentacles and suction cups it traps its prey");
    }

    public void smokescreen(){
        System.out.println("fills its surrounding area with pitch black ink");
    }

    public void aquaJet(){
        System.out.println("propels itself forward with a jet of water");
    }

    public void beak(){
      System.out.println("having ensnared its prey, it uses its beak to tear the prey apart");
    }    
    
    public void motherOfTheYear(){
      System.out.println("having laid her eggs, the mother does not eat or leave her eggs. She cares for the eggs and cleans them but dies shortly after they hatch.");
    }

    public void camoflauge(){
        if camoflauge{
            System.out.println("The octopus blends into its surroundings using chromatophores in their skins. By controlling the size of the cells they can vary their color and even create changing patterns.")
        }
        else {
            System.out.println("The octopus has hidden in a crevice");
        }
    }

    @Override
    public void attack() {
        if(isNight) {
            nightVision();
        }
        suction();
        aquaJet();
        beak();
    }

    @Override
    public void move() {
        aquaJet();
    }

    @Override
    public void defend() {
      camoflauge();
      smokescreen();
      aquaJet();
    }

    @Override
    public void flee() {
        aquaJet();
    }

    /*------------------------- Getters ---------------------------*/
    public String getName(){
        return name;
    }

    public static int getEYE() {
        return EYE;
    }

    public static int getARM() {
        return ARM;
    }

    public static int getLEG() {
        return LEG;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getCamoflauge() {
        return camoflauge;
    }

