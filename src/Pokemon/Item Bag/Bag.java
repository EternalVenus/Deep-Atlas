package Pokemon.ItemBag;

import java.util.ArrayList;

public class Bag {
    ArrayList<Berry> berryBag;
    ArrayList<KeyItems> keyItemBag;
    ArrayList<TM> tmBag;
    ArrayList<Medicine> medicineBag;
    ArrayList<PokeBall> pokeBallBag;
    ArrayList<BattleItem> battleItemBag;
    ArrayList<Item> itemBag;
    ArrayList<Mail> mailBag;

    public Bag(){
        this.berryBag = new ArrayList<Berry>();
        this.keyItemBag = new ArrayList<KeyItems>();
        this.tmBag = new ArrayList<TM>();
        this.medicineBag = new ArrayList<Medicine>();
        this.pokeBallBag = new ArrayList<PokeBall>();
        this.battleItemBag = new ArrayList<BattleItem>();
        this.itemBag = new ArrayList<Item>();
        this.mailBag = new ArrayList<Mail>();
    }

    public ArrayList<Berry> getBerryBag() {
        return berryBag;
    }

    public ArrayList<KeyItems> getKeyItemBag() {
        return keyItemBag;
    }

    public ArrayList<TM> getTmBag() {
        return tmBag;
    }

    public ArrayList<Medicine> getMedicineBag() {
        return medicineBag;
    }

    public ArrayList<PokeBall> getPokeBallBag() {
        return pokeBallBag;
    }

    public ArrayList<BattleItem> getBattleItemBag() {
        return battleItemBag;
    }

    public ArrayList<Item> getItemBag() {
        return itemBag;
    }

    public ArrayList<Mail> getMailBag() {
        return mailBag;
    }
}
