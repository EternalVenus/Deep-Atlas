package Pokemon.ItemBag.BattleItem;

import Pokemon.Pokemons.Pokemon;

import java.util.ArrayList;

public class BattleItemBag{
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
    public boolean useBattleItem(int indexOfBattleItem, Pokemon pokemon){
        // if the Battle item is not found.
        if (indexOfBattleItem < 0 || indexOfBattleItem >= battleItemList.size()){
            return false;
        }else{
            // if the battle item is found
            // the "if" statement returns true if the item is used
            // returns false if then item has no effect and is not used
            if (battleItemList.get(indexOfBattleItem).useBattleItem(pokemon)){
                battleItemList.get(indexOfBattleItem).setAmount(-1);
                return true;
            }else{
                return false;
            }
        }
    }

    public void listItems(){
        if (battleItemList.size() != 0){
            System.out.println("----Battle items----");

            for (int i = 0 ; i < battleItemList.size(); i++){
                System.out.println(i + ") " + battleItemList.get(i).getName() + " :" + battleItemList.get(i).getAmount());
            }
            System.out.println("--------------------");
        }
    }

    public ArrayList<BattleItem> getBattleItemList() {
        return battleItemList;
    }
}
