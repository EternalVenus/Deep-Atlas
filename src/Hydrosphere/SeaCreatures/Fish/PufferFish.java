import Hydrosphere.SeaCreatures.Fish.Fish;

public class PufferFish extends Fish {  // extend means it inherits from SeaCreature class
    private final static int EYE = 2;    
    private final static int Teeth = 4;
    private String name;
    private int size;
    private boolean blend; // can it camoflauge? 
    private int fry; // baby fish


    public void reproduce(){
        fry += 1 + (Math.floor((Math.random() * 3)));
        System.out.println(fry + "baby puffer fish have been born!");
    }    
    
    public void growth(){
        size += 12 + (Math.floor((Math.random() * 36)));
        System.out.println("This puffer is " + size + "inches long");
    }


    public void hungry(boolean prey) {
        if (prey) {
            beak();
            System.out.println("Puffer fish only have four teeth. Two on top and two on the bottom. They prefer crunchy food such as clams to keep their teeth trimmed.");
        }
    }

    public void ballon() {
        System.out.println("as a defense mechanism, the puffer fish sucks up water to inflate itself.");
    }

    public void beak() {
        System.out.println("puffer fish have powerful jaws to allow it to break shells of clams or other shelled creatures.");
    }

    public void poisionSting() {
        System.out.println("Having the ability to produce tetrodotoxin, this last resort will kill any predator that atempts to eat it.");
    }

    public void camoflauge() {
        if (blend) {
            System.out.println("The puffer uses its surrounding environment to hide from predators");
        } else {
            ballon();
        }
    }

    /*------------------------- Getters ---------------------------*/
    public String getName() {
        return name;
    }

    public static int getEYE() {
        return EYE;
    }

    public static int getTeeth() {
        return Teeth;
    }

    public int getSize() {
        return size;
    }
}


