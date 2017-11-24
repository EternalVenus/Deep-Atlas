package Pokemon.ItemBag.Berries;

import Pokemon.Pokemons.Pokemon;

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
    public boolean useBerry(int indexOfBerry, Pokemon pokemon){
        // if the berry is not found.
        if (indexOfBerry < 0 || indexOfBerry >= berryList.size()){
            return false;
        }else{
            // if the berry is found.
            // The "if" statement returns true is the item is used
            // returns false if the item has no effect and is not used
            if (berryList.get(indexOfBerry).useBerry(pokemon)){
                berryList.get(indexOfBerry).setAmount(-1);
                return true;
            }else{
                return false;
            }
        }
    }

    public void listItems(){
        if (berryList.size() != 0){
            System.out.println("----- Berries ------");
            for (int i = 0 ; i < berryList.size(); i++){
                System.out.println(i + ") " + berryList.get(i).getName() + " :" + berryList.get(i).getAmount());
            }
            System.out.println("--------------------");
        }
    }

    public ArrayList<Berry> getBerryList() {
        return berryList;
    }
}
