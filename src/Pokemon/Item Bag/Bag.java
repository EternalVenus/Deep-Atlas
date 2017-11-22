package Pokemon.ItemBag;

import java.util.ArrayList;

public class Bag {
    ArrayList<Item> itemBag;
    ArrayList<Medicine> medicineBag;
    ArrayList<PokeBall> pokeBallBag;
    ArrayList<Berry> berryBag;
    ArrayList<KeyItems> keyItemBag;
    ArrayList<TM> tmBag;
    ArrayList<BattleItem> battleItemBag;
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

    public void listBags(){
        System.out.println("0) Items");
        System.out.println("1) Medicine");
        System.out.println("2) Poke Balls");
        System.out.println("4) TM");
        System.out.println("5) Berry");
        System.out.println("6) Battle Item");
        System.out.println("7) Mails");
        System.out.println("8) Key Item");
    }

    public void listItem(int bagNumber){
        switch (bagNumber){
            case 0:
                System.out.println("--------------------------");
                System.out.println("Listing Items in Bag");
                for (int i = 0; i < itemBag.size(); i++){
                    System.out.println(i + ") " + itemBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 1:
                System.out.println("--------------------------");
                System.out.println("Listing Medicines in Bag");
                for (int i = 0; i < medicineBag.size(); i++){
                    System.out.println(i + ") " + medicineBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 2:
                System.out.println("--------------------------");
                System.out.println("Listing Medicine in Bag");
                for (int i = 0; i < medicineBag.size(); i++){
                    System.out.println(i + ") " + medicineBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 3:
                System.out.println("--------------------------");
                System.out.println("Listing Poke Balls in Bag");
                for (int i = 0; i < pokeBallBag.size(); i++){
                    System.out.println(i + ") " + pokeBallBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 4:
                System.out.println("--------------------------");
                System.out.println("Listing TMs in Bag");
                for (int i = 0; i < tmBag.size(); i++){
                    System.out.println(i + ") " + tmBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 5:
                System.out.println("--------------------------");
                System.out.println("Listing Berries in Bag");
                for (int i = 0; i < berryBag.size(); i++){
                    System.out.println(i + ") " + berryBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 6:
                System.out.println("--------------------------");
                System.out.println("Listing Battle Items in Bag");
                for (int i = 0; i < battleItemBag.size(); i++){
                    System.out.println(i + ") " + battleItemBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 7:
                System.out.println("--------------------------");
                System.out.println("Listing Mails in Bag");
                for (int i = 0; i < mailBag.size(); i++){
                    System.out.println(i + ") " + mailBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 8:
                System.out.println("--------------------------");
                System.out.println("Listing Key Items in Bag");
                for (int i = 0; i < keyItemBag.size(); i++){
                    System.out.println(i + ") " + keyItemBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
        }
    }
    public void addItem(Object item){
//        if ()
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
