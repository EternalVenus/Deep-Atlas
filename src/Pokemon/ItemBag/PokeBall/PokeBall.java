package Pokemon.ItemBag.PokeBall;

import java.util.concurrent.TimeUnit;

public class PokeBall{
    private String name;
    private String effect;
    private int catchRate;
    private String location;
    private int price;
    private int sellPrice;
    private int amount;
    private String description;

    public PokeBall(String name, String effect, String description, int catchRate,
                    String location, int price, int sellPrice, int amount) {
        this.name = name;
        this.effect = effect;
        this.catchRate = catchRate;
        this.location = location;
        this.price = price;
        this.sellPrice = sellPrice;
        this.amount = amount;
        this.description = description;
    }

    public int addPokeBall(int amount){
        this.amount += amount;
        return this.amount;
    }

    public boolean shake(){
        int counter = 0;
        for (int i = 0; i < 3; i++){
            double randomValue = Math.random();
            if (randomValue < .5 ){
                System.out.println("Shake");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                counter++;
            }
        }

        if (counter == 3){
            return true;
        }else{
            return false;
        }
    }

    public int usePokeBall(){
        return --this.amount;
    }

    public String getClassName(){
        return "Poke Ball";
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

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }
}
