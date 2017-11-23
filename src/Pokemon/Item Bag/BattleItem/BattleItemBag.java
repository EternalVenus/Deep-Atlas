package Pokemon.ItemBag.BattleItem;

import java.util.ArrayList;

public class BattleItemBag {
    private ArrayList<BattleItem> battleItemList;

    public BattleItemBag(){
        this.battleItemList = new ArrayList<>();
    }

    public int addBattleItem(BattleItem battleItem, int amount){
        if (this.battleItemList.indexOf(battleItem) >= 0){
            return battleItem.addBattleItem(amount);
        }else{
            this.battleItemList.add(battleItem);
            return battleItem.addBattleItem(amount);
        }
    }

    // If the battle Item is found, the method use the battle item
    // and subtract the amount.
    public int useBattleItem(BattleItem battleItem){
        // if the berry is found.
        if (this.battleItemList.indexOf(battleItem) >= 0){
            return battleItem.useBattleItem();
        }else{
            System.out.println("There is no such berry in the bag");
            return 0;
        }
    }
}
