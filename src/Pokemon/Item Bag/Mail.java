package Pokemon.ItemBag;

public class Mail extends BagCategory{
    private String name;
    private String effect;
    private String location;
    private int sellPrice;

    public Mail(String name, String effect, String location, int sellPrice) {
        this.name = name;
        this.effect = effect;
        this.location = location;
        this.sellPrice = sellPrice;
    }

    public String getClassName(){
        return "Mail";
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public String getLocation() {
        return location;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
