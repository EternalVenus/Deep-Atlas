package Pokemon.ItemBag.Medicine;

public class Medicine{
    private String name;
    private String description;
    private int price;
    private int power;
    private String effect;
    private int amount;

    public Medicine(String name, String description, int price, int power, String effect, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.power = power;
        this.effect = effect;
        this.amount = amount;
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

    public int getPower() {
        return power;
    }

    public String getEffect() {
        return effect;
    }

    public int getAmount() {
        return amount;
    }
}
