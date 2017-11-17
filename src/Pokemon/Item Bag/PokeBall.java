package Pokemon.ItemBag;

import Pokemon.Pokemon;

public class PokeBall {
    private String name;
    private String effect;
    private int catchRate;
    private String location;
    private int price;
    private int sellPrice;

    public PokeBall(String name, String effect, int catchRate, String location, int price, int sellPrice) {
        this.name = name;
        this.effect = effect;
        this.catchRate = catchRate;
        this.location = location;
        this.price = price;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
