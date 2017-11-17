package Pokemon.ItemBag;

import Pokemon.Pokemon;

public class TM {
    private String ID;
    private String name;
    private String category;
    private String type;
    private String description;
    private int PP;
    private int power;
    private int accuracy;

    public TM(String ID, String name, String category, String type, String description, int PP, int power, int accuracy) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.type = type;
        this.description = description;
        this.PP = PP;
        this.power = power;
        this.accuracy = accuracy;
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
}
