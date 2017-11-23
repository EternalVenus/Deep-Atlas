package Pokemon.ItemBag.Item;

public class Item {
    private String name;
    private String category;
    private String effect;
    private String description;
    private int amount;

    public Item(String name, String category, String effect, String description, int amount) {
        this.name = name;
        this.category = category;
        this.effect = effect;
        this.description = description;
        this.amount = amount;
    }

    public int addItem(int itemAmount){
        this.amount += itemAmount;
        return this.amount;
    }

    public int useItem(){
        return --this.amount;
    }

    public String getClassName(){
        return "Item";
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getEffect() {
        return effect;
    }

    public String getDescription() {
        return description;
    }
}
