package Pokemon.ItemBag.Medicine;

public class Medicine{
    private String name;
    private String description;
    private int price;
    private int sellPrice;
    private int amount;
    private String effect;
    private String location;

    public Medicine(String name, String description,String effect, String location, int sellPrice,int price, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.sellPrice = sellPrice;
        this.effect = effect;
        this.location = location;
    }

    public int addMedicine(int amount){
        this.amount += amount;
        return this.amount;
    }

    public int useMedicine(){
        return --this.amount;
    }


    public String getClassName(){
        return "Medicine";
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

    public String getEffect() {
        return effect;
    }

    public String getLocation() {
        return location;
    }

    public int getAmount() {
        return amount;
    }
}
