package Pokemon.ItemBag;

import Pokemon.ItemBag.BattleItem.*;
import Pokemon.ItemBag.Berries.*;
import Pokemon.ItemBag.Item.*;
import Pokemon.ItemBag.KeyItem.*;
import Pokemon.ItemBag.Mail.*;
import Pokemon.ItemBag.Medicine.*;
import Pokemon.ItemBag.PokeBall.*;
import Pokemon.ItemBag.TM.*;

public class Bag {
    private BattleItemBag battleItemBag;
    private BerryBag berryBag;
    private ItemBag itemBag;
    private KeyItemBag keyItemBag;
    private MailBag mailBag;
    private MedicineBag medicineBag;
    private PokeBallBag pokeBallBag;
    private TMBag tmBag;

    public Bag(){
        this.battleItemBag = new BattleItemBag();
        this.berryBag = new BerryBag();
        this.itemBag = new ItemBag();
        this.keyItemBag = new KeyItemBag();
        this.mailBag = new MailBag();
        this.medicineBag = new MedicineBag();
        this.pokeBallBag = new PokeBallBag();
        this.tmBag = new TMBag();
    }

    // listing the names of each bag category
    public void listBags(){
        System.out.println("0) Items");
        System.out.println("1) Medicine");
        System.out.println("2) Poke Balls");
        System.out.println("3) TM");
        System.out.println("4) Berries");
        System.out.println("5) Battle Item");
        System.out.println("6) Mails");
        System.out.println("7) Key Item\n");
    }

    public void listBattleBags(){
        System.out.println("0) Medicine");
        System.out.println("1) Poke Balls");
        System.out.println("2) Berries");
        System.out.println("3) Battle Item");
        System.out.println("4) Key Item\n");
    }

    // listing all the items in each bag
    public void listItemInBag(int bagNumber){
        switch (bagNumber){
            case 0:
                itemBag.listItems();
                break;
            case 1:
                medicineBag.listItems();
                break;
            case 2:
                pokeBallBag.listItems();
                break;
            case 3:
                tmBag.listItems();
                break;
            case 4:
                berryBag.listItems();
                break;
            case 5:
                battleItemBag.listItems();
                break;
            case 6:
                mailBag.listItems();
                break;
            case 7:
                keyItemBag.listItems();
                break;
        }
    }

    public void listBattleItemInBag(int bagNumber){
        switch (bagNumber){
            case 0:
                medicineBag.listItems();
                break;
            case 1:
                pokeBallBag.listItems();
                break;
            case 2:
                berryBag.listItems();
                break;
            case 3:
                battleItemBag.listItems();
                break;
            case 4:
                keyItemBag.listItems();
                break;
            default:
                System.out.println("There is no such category.");
        }
    }
    // The method checks the category of the item. Then add the item to the specific bag.
    // Trying to make the method more generic by using Object. Then checking the instance of the Object
    public boolean addItem(Object item, int quantity){
        if (item instanceof BattleItem){
            this.battleItemBag.addBattleItem((BattleItem)item, quantity);
            return true;

        }else if(item instanceof Berry){
            this.berryBag.addBerry((Berry)item, quantity);
            return true;

        }else if(item instanceof Item){
            this.itemBag.addItem((Item)item, quantity);
            return true;

        }else if(item instanceof KeyItems){
            return this.keyItemBag.addKeyItem((KeyItems)item);

        }else if (item instanceof Mail) {
            this.mailBag.addMail((Mail)item, quantity);
            return true;

        }else if(item instanceof Medicine) {
            this.medicineBag.addMedicine((Medicine) item, quantity);
            return true;

        }else if(item instanceof PokeBall) {
            this.pokeBallBag.addPokeBall((PokeBall)item, quantity);
            return true;

        }else if(item instanceof TM) {
            this.tmBag.addTM((TM)item);
            return true;

        }else {
            return false;
        }

    }

    public BerryBag getBerryBag() {
        return berryBag;
    }

    public KeyItemBag getKeyItemBag() {
        return keyItemBag;
    }

    public TMBag getTmBag() {
        return tmBag;
    }

    public MedicineBag getMedicineBag() {
        return medicineBag;
    }

    public PokeBallBag getPokeBallBag() {
        return pokeBallBag;
    }

    public BattleItemBag getBattleItemBag() {
        return battleItemBag;
    }

    public ItemBag getItemBag() {
        return itemBag;
    }

    public MailBag getMailBag() {
        return mailBag;
    }
}
