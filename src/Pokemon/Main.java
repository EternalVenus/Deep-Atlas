package Pokemon;

import Pokemon.ItemBag.Bag;
import Pokemon.ItemBag.BattleItem.AllBattleItem.XAttack;
import Pokemon.ItemBag.BattleItem.AllBattleItem.XDefense;
import Pokemon.ItemBag.Berries.AllBerry.Oran;
import Pokemon.ItemBag.Berries.AllBerry.Sitrus;
import Pokemon.ItemBag.Medicine.AllMedicine.HyperPotion;
import Pokemon.ItemBag.Medicine.AllMedicine.Potion;
import Pokemon.ItemBag.Medicine.AllMedicine.SuperPotion;
import Pokemon.ItemBag.PokeBall.AllPokeBalls.FriendBall;
import Pokemon.ItemBag.PokeBall.AllPokeBalls.MoonBall;
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

        pokemonBag.addToBag(new Dragonair());
        pokemonBag.addToBag(new Dragonite());
        pokemonBag.addToBag(new Dratini());
        pokemonBag.addToBag(new Pichu());
        pokemonBag.addToBag(new Pikachu());
        pokemonBag.addToBag(new Dragonite());

        pokemonBag2.addToBag(new Dratini());
//        pokemonBag2.addToBag(new Pichu());
//        pokemonBag2.addToBag(new Pichu());
//        pokemonBag2.addToBag(new Dragonite());
//        pokemonBag2.addToBag(new Dragonair());
//        pokemonBag2.addToBag(new Pikachu());

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

        itemBag.addItem(moonBall, 2);
        itemBag.addItem(friendBall, 2);
        itemBag.addItem(hyperPotion, 10);
        itemBag.addItem(potion, 100);
        itemBag.addItem(superPotion, 1);
        itemBag.addItem(oran, 1);
        itemBag.addItem(sitrus, 20);
        itemBag.addItem(xDefense, 1);
        itemBag.addItem(xAttack, 20);


        // Testing player class and pokemon battle class
        PokemonPlayer david = new PokemonPlayer("David", "Male", pokemonBag, itemBag);
        PokemonPlayer hen = new PokemonPlayer("Hen", "Female", pokemonBag2, itemBag);

        PokemonBattle pokemonBattle = new PokemonBattle(david, hen);

        pokemonBattle.startBattle();
    }
}

