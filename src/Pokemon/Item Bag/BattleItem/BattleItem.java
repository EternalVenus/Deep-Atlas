package Pokemon.ItemBag.BattleItem;

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
        return this.amount;
    }

    public int useBattleItem(){
        return --this.amount;
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
}
