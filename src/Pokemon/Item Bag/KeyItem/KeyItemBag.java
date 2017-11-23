package Pokemon.ItemBag.KeyItem;

import java.util.ArrayList;

public class KeyItemBag {
    private ArrayList<KeyItems> keyItemList;

    public KeyItemBag(){
        this.keyItemList = new ArrayList<>();
    }

    public void listItems(){
        for (int i = 0 ; i < keyItemList.size(); i++){
            System.out.println("----- Key Items -----");
            System.out.println(i + ") " + keyItemList.get(i));
        }
            System.out.println("---------------------");
    }

    public boolean addKeyItem(KeyItems item){
        if (keyItemList.indexOf(item) >= 0){
            return false;
        }else{
            keyItemList.add(item);
            return true;
        }
    }

    public ArrayList<KeyItems> getKeyItemList() {
        return keyItemList;
    }
}
