package Pokemon.ItemBag;

public class Item extends BagCategory{
    private String name;
    private String category;
    private String effect;
    private String description;

    public Item(String name, String category, String effect, String description) {
        this.name = name;
        this.category = category;
        this.effect = effect;
        this.description = description;
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
