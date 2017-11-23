package Pokemon.ItemBag.Berries;

import java.util.ArrayList;

public class BerryBag {
    private ArrayList<Berry> berryList;

    public BerryBag(){
        this.berryList = new ArrayList<>();
    }

    // Adding a berry to the bag. If the berry already exist in the bag,
    // it adds the quantity of the berry to the amount
    // else it just adds a new berry in the array list
    public int addBerry(Berry berry, int amount){
        if (this.berryList.indexOf(berry) >= 0){
            return berry.addBerry(amount);
        }else{
            this.berryList.add(berry);
            return berry.addBerry(amount);
        }
    }

    // If the berry is found, the method use the berry and subtract the amount.
    public int useBerry(Berry berry){
        // if the berry is found.
        if (this.berryList.indexOf(berry) >= 0){
            return berry.useBerry();
        }else{
            System.out.println("There is no such berry in the bag");
            return 0;
        }
    }
}
