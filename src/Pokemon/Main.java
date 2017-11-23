package Pokemon;

import Pokemon.ItemBag.Bag;
import Pokemon.ItemBag.PokeBall.AllPokeBalls.FriendBall;
import Pokemon.ItemBag.PokeBall.AllPokeBalls.MoonBall;
import Pokemon.Pokemons.Pichu;
import Pokemon.Pokemons.Pikachu;
import Pokemon.Skill.*;
import Pokemon.Skill.B.Barrage;

public class Main {
    public static void main(String[] args){

        Pikachu pikachu = new Pikachu();
        Pichu pichu = new Pichu();
//        Pokemon charmander = new Pokemon("Charmander");
//        Pokemon squirtle = new Pokemon("Squirtle");
//        Pokemon piplup = new Pokemon("Piplup");
//        Pokemon bulbasaur = new Pokemon("Bulbasaur");
//        Pokemon mew = new Pokemon("Mew");
//        Pokemon mewtwo = new Pokemon("MewTwo");

        PokemonPC pc = new PokemonPC();
        PokemonBag pokemonBag = new PokemonBag(pc);
        PokemonBag pokemonBag2 = new PokemonBag(pc);

        Bag itemBag = new Bag();

        pokemonBag.addToBag(pikachu);
        pokemonBag2.addToBag(pichu);

        MoonBall moonBall = new MoonBall();
        FriendBall friendBall = new FriendBall();

        itemBag.addItem(moonBall, 30);
        itemBag.addItem(friendBall, 30);


        // Testing player class and pokemon battle class
        PokemonPlayer david = new PokemonPlayer("David", "Male", pokemonBag, itemBag);
        PokemonPlayer hen = new PokemonPlayer("Hen", "Female", pokemonBag2, itemBag);

        PokemonBattle pokemonBattle = new PokemonBattle(david, pikachu);

        pokemonBattle.startBattle();
    }
}

//
//        //bag full here
//        bag.addToBag(mewtwo);
//        bag.addToBag(mew);
//
//        bag.removePokemon(pikachu,pc, 10);
//        bag.removePokemon(squirtle,pc, 10);
//
////        bag.listPokemons();
//
//        pc.storePokemon(pikachu,10);
//        pc.storePokemon(pikachu,10);
//        pc.storePokemon(mew,10);
//        pc.storePokemon(mewtwo,10);
//
//
//        pc.retrievePokemon(pikachu, 10, bag);
//        pc.retrievePokemon(pikachu, 10, bag);
//        bag.listPokemons();
//        pc.showPokemon(5);
//        pc.showPokemon(10);
