package Pokemon.ItemBag;

public class BattleItem {
    private String name;
    private int price;
    private int sellPrice;
    private String location;
    private String effect;

    public BattleItem(String name, int price, int sellPrice, String location, String effect) {
        this.name = name;
        this.price = price;
        this.sellPrice = sellPrice;
        this.location = location;
        this.effect = effect;
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
}
