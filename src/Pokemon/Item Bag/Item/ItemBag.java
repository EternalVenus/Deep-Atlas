package Pokemon.ItemBag.Item;

import java.util.ArrayList;

public class ItemBag {
    private ArrayList<Item> itemList;

    public ItemBag(){
        itemList = new ArrayList<>();
    }

    // Adding a berry to the bag. If the berry already exist in the bag,
    // it adds the quantity of the berry to the amount
    // else it just adds a new berry in the array list
    public int addItem(Item item, int amount){
        if (this.itemList.indexOf(item) >= 0){
            return item.addItem(amount);
        }else{
            this.itemList.add(item);
            return item.addItem(amount);
        }
    }

    // If the berry is found, the method use the berry and subtract the amount.
    public int useItem(Item item){
        // if the berry is found.
        if (this.itemList.indexOf(item) >= 0){
            return item.useItem();
        }else{
            System.out.println("There is no such item in the bag");
            return 0;
        }
    }

    public void listItems(){
        if (itemList.size() != 0) {
            System.out.println("----- Items -----");
            for (int i = 0 ; i < itemList.size(); i++){
                System.out.println(i + ") " + itemList.get(i) + " :" + itemList.get(i).getAmount());
            }
            System.out.println("----------------");
        }
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
}
