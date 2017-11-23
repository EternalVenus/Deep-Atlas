package Pokemon.ItemBag.TM;

public class TM {
    private String ID;
    private String name;
    private String category;
    private String type;
    private String description;
    private String effect;
    private int PP;
    private int power;
    private int accuracy;

    public TM(String ID, String name, String category, String type, String description, String effect, int PP, int power, int accuracy) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.type = type;
        this.description = description;
        this.effect = effect;
        this.PP = PP;
        this.power = power;
        this.accuracy = accuracy;
    }

    public String getClassName(){
        return "TM";
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getPP() {
        return PP;
    }

    public int getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public String getEffect() {
        return effect;
    }
}
