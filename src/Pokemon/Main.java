package Pokemon;

import Pokemon.ItemBag.Bag;
import Pokemon.ItemBag.BattleItem.AllBattleItem.XAttack;
import Pokemon.ItemBag.BattleItem.AllBattleItem.XDefense;
import Pokemon.ItemBag.Berries.AllBerry.Oran;
import Pokemon.ItemBag.Berries.AllBerry.Sitrus;
import Pokemon.ItemBag.Item.AllItem.AbsorbBulb;
import Pokemon.ItemBag.Item.AllItem.AdamantOrb;
import Pokemon.ItemBag.KeyItem.AllKeyItem.DNASplicers;
import Pokemon.ItemBag.KeyItem.AllKeyItem.ExpShare;
import Pokemon.ItemBag.Mail.AllMails.AirMail;
import Pokemon.ItemBag.Mail.AllMails.BloomMail;
import Pokemon.ItemBag.Medicine.AllMedicine.HyperPotion;
import Pokemon.ItemBag.Medicine.AllMedicine.Potion;
import Pokemon.ItemBag.Medicine.AllMedicine.SuperPotion;
import Pokemon.ItemBag.PokeBall.AllPokeBalls.FriendBall;
import Pokemon.ItemBag.PokeBall.AllPokeBalls.MoonBall;
import Pokemon.ItemBag.TM.AllTM.TM01;
import Pokemon.ItemBag.TM.AllTM.TM02;
import Pokemon.Pokemons.*;
import Pokemon.Skill.*;
import Pokemon.Skill.B.Barrage;
import org.omg.CORBA.ORB;

public class Main {
    public static void main(String[] args){

        PokemonPC pc = new PokemonPC();
        PokemonBag pokemonBag = new PokemonBag(pc);
        PokemonBag pokemonBag2 = new PokemonBag(pc);

        Bag itemBag = new Bag();

        pokemonBag.addToBag(new Pikachu(50));
        pokemonBag.addToBag(new Pikachu(50));
        pokemonBag.addToBag(new Pikachu(50));
        pokemonBag.addToBag(new Pikachu(50));
        pokemonBag.addToBag(new Pikachu(50));
        pokemonBag.addToBag(new Pikachu(50));

        pokemonBag2.addToBag(new Pichu(50));
        pokemonBag2.addToBag(new Pichu(50));
        pokemonBag2.addToBag(new Pichu(50));
//        pokemonBag2.addToBag(new Dragonite(50));
//        pokemonBag2.addToBag(new Dragonair(50));
        pokemonBag2.addToBag(new Pikachu(50));

        // TEST POKEBALLS HERE
        MoonBall moonBall = new MoonBall();
        FriendBall friendBall = new FriendBall();

        // TEST MEDICINES HERE
        HyperPotion hyperPotion = new HyperPotion();
        Potion potion = new Potion();
        SuperPotion superPotion = new SuperPotion();

        // TEST BERRIES HERE
        Oran oran = new Oran();
        Sitrus sitrus = new Sitrus();

        // TEST BATTLE ITEMS HERE
        XDefense xDefense = new XDefense();
        XAttack xAttack = new XAttack();

        // TEST TM HERE
        TM01 tm01 = new TM01();
        TM02 tm02 = new TM02();

        //TEST ITEM HERE
        AbsorbBulb absorbBulb = new AbsorbBulb();
        AdamantOrb adamantOrb = new AdamantOrb();

        //TEST KEYITEMS HERE
        DNASplicers dnaSplicers = new DNASplicers();
        ExpShare expShare = new ExpShare();

        // TESTING MAIL HERE
        AirMail airMail = new AirMail();
        BloomMail bloomMail = new BloomMail();

        // TESTING ITEM BAG CLASS
        itemBag.addItem(moonBall, 2);
        itemBag.addItem(friendBall, 2);
        itemBag.addItem(hyperPotion, 10);
        itemBag.addItem(potion, 100);
        itemBag.addItem(superPotion, 1);
        itemBag.addItem(oran, 1);
        itemBag.addItem(sitrus, 20);
        itemBag.addItem(xDefense, 1);
        itemBag.addItem(xAttack, 20);
        itemBag.addItem(tm01, 1);
        itemBag.addItem(tm02, 1);
        itemBag.addItem(adamantOrb, 1);
        itemBag.addItem(absorbBulb, 1);
        itemBag.addItem(dnaSplicers, 1);
        itemBag.addItem(expShare, 1);
        itemBag.addItem(airMail, 1);
        itemBag.addItem(bloomMail, 1);

//        itemBag.getBattleItemBag().listItems();
//        itemBag.getBerryBag().listItems();
//        itemBag.getMedicineBag().listItems();
//        itemBag.getPokeBallBag().listItems();
//        itemBag.getKeyItemBag().listItems();
//        itemBag.getTmBag().listItems();
//        itemBag.getMailBag().listItems();
//        itemBag.getItemBag().listItems();

        // Testing player class and pokemon battle class
        PokemonPlayer david = new PokemonPlayer("David", "Male", pokemonBag, itemBag);
        PokemonPlayer hen = new PokemonPlayer("Jerry", "Female", pokemonBag2, itemBag);

        // TEST POKEMON BATTLE HERE
        PokemonBattle pokemonBattle = new PokemonBattle(david, hen);
        pokemonBattle.startBattle();
    }
}

