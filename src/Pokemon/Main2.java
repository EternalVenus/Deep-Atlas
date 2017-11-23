package Pokemon;

import Pokemon.ItemBag.*;
import Pokemon.ItemBag.BattleItem.AllBattleItem.*;
import Pokemon.ItemBag.Berries.AllBerry.*;
import Pokemon.ItemBag.Item.AllItem.*;
import Pokemon.ItemBag.KeyItem.AllKeyItem.*;
import Pokemon.ItemBag.Mail.AllMails.*;
import Pokemon.ItemBag.Medicine.AllMedicine.*;
import Pokemon.ItemBag.PokeBall.AllPokeBalls.*;
import Pokemon.ItemBag.TM.AllTM.*;

public class Main2 {
    public static void main(String[] args) {
        Bag itemBag = new Bag();

        // Checking if Battle Item works in the bag
        XAttack xAttack = new XAttack();
        XDefense xDefense = new XDefense();

        // Checking if Berry works in the bag
        Oran oranBerry = new Oran();
        Sitrus sitrusBerry = new Sitrus();

        // Checking if Item works in the bag
        AbsorbBulb absorbBulb = new AbsorbBulb();
        AdamantOrb adamantOrb = new AdamantOrb();

        // checking if Key items works in the bag
        DNASplicers dnaSplicers = new DNASplicers();
        ExpShare expShare = new ExpShare();

        // checking if Mail works in the bag
        AirMail airMail = new AirMail();
        BloomMail bloomMail = new BloomMail();

        // checking if the Potion works in the bag
        Potion potion = new Potion();
        SuperPotion superPotion = new SuperPotion();
        HyperPotion hyperPotion = new HyperPotion();

        // checking if the Pokeballs works in the bag
        MoonBall moonBall = new MoonBall();
        FriendBall friendBall = new FriendBall();

        // checking if the TM works in the bag
        TM01 tm01 = new TM01();
        TM02 tm02 = new TM02();

        itemBag.listBags();

        itemBag.addItem(xAttack, 10);
        itemBag.addItem(xAttack, 10);
        itemBag.addItem(xDefense, 100);

        itemBag.addItem(oranBerry, 30);
        itemBag.addItem(sitrusBerry, 100);

        itemBag.addItem(absorbBulb, 40);
        itemBag.addItem(adamantOrb, 10);

        itemBag.addItem(dnaSplicers, 1);
        itemBag.addItem(expShare, 1);

        itemBag.addItem(airMail, 100);
        itemBag.addItem(bloomMail, 50);

        itemBag.addItem(potion, 20);
        itemBag.addItem(superPotion, 30);
        itemBag.addItem(hyperPotion, 100);

        itemBag.addItem(moonBall, 50);
        itemBag.addItem(friendBall, 100);

        itemBag.addItem(tm01,1);
        itemBag.addItem(tm02, 1);

        for (int i = 0; i < 8; i++){
            itemBag.listItemInBag(i);
        }
    }
}
