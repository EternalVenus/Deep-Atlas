package Pokemon.ItemBag.BattleItem;

import Pokemon.Pokemons.Pokemon;

public class BattleItem {
    private String name;
    private int price;
    private int sellPrice;
    private String location;
    private String effect;
    private int amount;

    public BattleItem(String name, int price, int sellPrice,
                      String location, String effect, int amount) {
        this.name = name;
        this.price = price;
        this.sellPrice = sellPrice;
        this.location = location;
        this.effect = effect;
        this.amount = amount;
    }

    public int addBattleItem(int amount){
        this.amount += amount;
        return getAmount();
    }

    // to be overriden by extended classes
    public boolean useBattleItem(Pokemon pokemon){
        return true;
    }


    public String getClassName(){
        return "Battle Item";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getLocation() {
        return location;
    }

    public String getEffect() {
        return effect;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }
}
