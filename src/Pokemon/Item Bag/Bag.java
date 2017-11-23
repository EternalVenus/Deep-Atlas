package Pokemon.ItemBag;

import java.util.ArrayList;

public class Bag {
    private ArrayList<BagCategory> itemBag;
    private ArrayList<BagCategory> medicineBag;
    private ArrayList<BagCategory> pokeBallBag;
    private ArrayList<BagCategory> berryBag;
    private ArrayList<BagCategory> keyItemBag;
    private ArrayList<BagCategory> tmBag;
    private ArrayList<BagCategory> battleItemBag;
    private ArrayList<BagCategory> mailBag;

    public Bag(){
        this.berryBag = new ArrayList<BagCategory>();
        this.keyItemBag = new ArrayList<BagCategory>();
        this.tmBag = new ArrayList<BagCategory>();
        this.medicineBag = new ArrayList<BagCategory>();
        this.pokeBallBag = new ArrayList<BagCategory>();
        this.battleItemBag = new ArrayList<BagCategory>();
        this.itemBag = new ArrayList<BagCategory>();
        this.mailBag = new ArrayList<BagCategory>();
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
        System.out.println("7) Key Item");
    }

    // listing all the items in each bag
    public void listItemInBag(int bagNumber){
        switch (bagNumber){
            case 0:
                System.out.println("--------------------------");
                System.out.println("Listing Items in Bag");
                for (int i = 0; i < itemBag.size(); i++){
                    System.out.println(i + ") " + itemBag.get(i).getName() + " - " +  itemBag.get(i).getAmount());
                }
                System.out.println("--------------------------");
                break;
            case 1:
                System.out.println("--------------------------");
                System.out.println("Listing Medicine in Bag");
                for (int i = 0; i < medicineBag.size(); i++){
                    System.out.println(i + ") " + medicineBag.get(i).getName()+ " - " +  medicineBag.get(i).getAmount() );
                }
                System.out.println("--------------------------");
                break;
            case 2:
                System.out.println("--------------------------");
                System.out.println("Listing Poke Balls in Bag");
                for (int i = 0; i < pokeBallBag.size(); i++){
                    System.out.println(i + ") " + pokeBallBag.get(i).getName() + " - " +  pokeBallBag.get(i).getAmount() );
                }
                System.out.println("--------------------------");
                break;
            case 3:
                System.out.println("--------------------------");
                System.out.println("Listing TMs in Bag");
                for (int i = 0; i < tmBag.size(); i++){
                    System.out.println(i + ") " + tmBag.get(i).getName());
                }
                System.out.println("--------------------------");
                break;
            case 4:
                System.out.println("--------------------------");
                System.out.println("Listing Berries in Bag");
                for (int i = 0; i < berryBag.size(); i++){
                    System.out.println(i + ") " + berryBag.get(i).getName() + " - " +  berryBag.get(i).getAmount());
                }
                System.out.println("--------------------------");
                break;
            case 5:
                System.out.println("--------------------------");
                System.out.println("Listing Battle Items in Bag");
                for (int i = 0; i < battleItemBag.size(); i++){
                    System.out.println(i + ") " + battleItemBag.get(i).getName() + " - " +  battleItemBag.get(i).getAmount());
                }
                System.out.println("--------------------------");
                break;
            case 6:
                System.out.println("--------------------------");
                System.out.println("Listing Mails in Bag");
                for (int i = 0; i < mailBag.size(); i++){
                    System.out.println(i + ") " + mailBag.get(i).getName() + " - " +  mailBag.get(i).getAmount());
                }
                System.out.println("--------------------------");
                break;
            case 7:
                System.out.println("--------------------------");
                System.out.println("Listing Key Items in Bag");
                for (int i = 0; i < keyItemBag.size(); i++){
                    System.out.println(i + ") " + keyItemBag.get(i).getName() + " - " +  keyItemBag.get(i).getAmount());
                }
                System.out.println("--------------------------");
                break;
        }
    }

    // The method checks the category of the item. Then add the item to the specific bag.
    public void addItem(BagCategory item, int quantity){
        switch (item.getClassName()){
            case "Battle Item":
                this.battleItemBag.add(item);
                break;
            case "Berries":
                // if the item is already in the bag. just increase the quantity
                if (this.berryBag.indexOf(item) >= 0){
                    item.addBerry(quantity);
                }else{
                    this.berryBag.add(item);
                    item.addBerry(quantity);
                }

                break;
            case "Item":
                this.itemBag.add(item);
                break;
            case "Key Item":
                this.keyItemBag.add(item);
                break;
            case "Mail":
                this.mailBag.add(item);
                break;
            case "Medicine":
                this.medicineBag.add(item);
                break;
            case "Poke Ball":
                this.medicineBag.add(item);
                break;
            case "TM":
                this.tmBag.add(item);
                break;
            default:
                System.out.println("The Item can not be put inside the bag!!");
        }
    }

    public ArrayList<BagCategory> getBerryBag() {
        return berryBag;
    }

    public ArrayList<BagCategory> getKeyItemBag() {
        return keyItemBag;
    }

    public ArrayList<BagCategory> getTmBag() {
        return tmBag;
    }

    public ArrayList<BagCategory> getMedicineBag() {
        return medicineBag;
    }

    public ArrayList<BagCategory> getPokeBallBag() {
        return pokeBallBag;
    }

    public ArrayList<BagCategory> getBattleItemBag() {
        return battleItemBag;
    }

    public ArrayList<BagCategory> getItemBag() {
        return itemBag;
    }

    public ArrayList<BagCategory> getMailBag() {
        return mailBag;
    }
}
