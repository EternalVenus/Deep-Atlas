package Pokemon.ItemBag;

import Pokemon.Pokemon;

public class Medicine {
    private String name;
    private String description;
    private int price;
    private int power;
    private String effect;

    public Medicine(String name, String description, int price, int power, String effect) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.power = power;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public String getEffect() {
        return effect;
    }
}
