package Pokemon.ItemBag;

import Pokemon.Pokemon;

public class Berry extends BagCategory{
    private String name;
    private String description;
    private int growthTime;
    private int amount;
    private double size;
    private String location;
    private String firmness;


    public Berry(String name, String description, int growthTime, int amount,
                 double size, String location, String firmness) {
        this.name = name;
        this.description = description;
        this.growthTime = growthTime;
        this.amount = amount;
        this.size = size;
        this.location = location;
        this.firmness = firmness;
    }

    public String getClassName(){
        return "Berries";
    }

    // function to be override
    public void effect(Pokemon pokemon){
        System.out.println("Effect of the Berries");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public int getAmount() {
        return amount;
    }

    public double getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public String getFirmness() {
        return firmness;
    }

    public int addBerry(int berryAmount){
        this.amount += berryAmount;
        return this.amount;
    }
}
