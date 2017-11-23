package Pokemon.ItemBag.Mail;

public class Mail {
    private String name;
    private String effect;
    private String location;
    private String description;
    private int price;
    private int sellPrice;
    private int amount;

    public Mail(String name, String effect, String location, String description, int price ,int sellPrice, int amount) {
        this.name = name;
        this.effect = effect;
        this.location = location;
        this.sellPrice = sellPrice;
        this.amount = amount;
        this.price = price;
        this.description = description;
    }

    public int addMail(int amount){
        this.amount += amount;
        return this.amount;
    }

    public int useMail(){
        return --this.amount;
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

    public int getAmount() {
        return amount;
    }
}
