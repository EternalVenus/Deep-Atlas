package Pokemon.ItemBag;

import Pokemon.Pokemon;

public class Berry extends BagCategory{
    private String name;
    private String description;
    private String flavor;
    private int growthTime;
    private int amount;
    private String generation;
    private int size;
    private String location;
    private String firmness;


    public Berry(String name, String description, String flavor, int growthTime, int amount,
                 String generation, int size, String location, String firmness) {
        this.name = name;
        this.description = description;
        this.flavor = flavor;
        this.growthTime = growthTime;
        this.amount = amount;
        this.generation = generation;
        this.size = size;
        this.location = location;
        this.firmness = firmness;
    }

    public String getClassName(){
        return "Berry";
    }

    // function to be override
    public void effect(Pokemon pokemon){
        System.out.println("Effect of the Berry");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public int getAmount() {
        return amount;
    }

    public String getGeneration() {
        return generation;
    }

    public int getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public String getFirmness() {
        return firmness;
    }
}
