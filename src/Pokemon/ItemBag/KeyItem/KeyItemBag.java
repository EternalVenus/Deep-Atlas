package Pokemon.ItemBag.KeyItem;

import java.util.ArrayList;

public class KeyItemBag {
    private ArrayList<KeyItems> keyItemList;

    public KeyItemBag(){
        this.keyItemList = new ArrayList<>();
    }

    public void listItems(){
        if (keyItemList.size() != 0){
            System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊ Key Items ＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
            for (int i = 0 ; i < keyItemList.size(); i++){
                System.out.println("\t\t\t\t\t  " + i + ") " + keyItemList.get(i).getName());
            }
            System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        }
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
