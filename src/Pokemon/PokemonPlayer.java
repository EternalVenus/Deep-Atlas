package Pokemon;

import java.util.Collections;
import Pokemon.Skill.*;

public class PokemonPlayer {
    private String name;
    private String gender;
    private PokemonBag pokemonBag;
    private int money;
    private Pokemon pokemonActive;
    private boolean blackOut;

    public PokemonPlayer(String name, String gender, PokemonBag pokemonBag) {
        this.name = name;
        this.gender = gender;
        this.pokemonBag = pokemonBag;
        this.money = 0;
        // Active pokemon is the first pokemon in the bag
        this.pokemonActive = pokemonBag.getPokemon().get(0);
        this.blackOut = false;
    }

    // switches to a pokemon in the bag using its index value
    public boolean switchPokemon(int num){
        if (num < 0 || num > 5){
            System.out.println("There are only 6 pokemon. Pick a number from 0 - 5 ");
            return false;
        }else if(num == 0){
            // Telling the player the first pokemon in the bag is already in battle
            System.out.println(this.pokemonBag.getPokemon().get(0).getName() + " is already on the battle field.");
            return false;
        }
        else{
            // swaps the 2 pokemon in the pokemon bag
            System.out.println(this.pokemonActive.getName() + " return.");
            Collections.swap(this.pokemonBag.getPokemon(), 0, num);
            this.pokemonActive = this.pokemonBag.getPokemon().get(0);
            System.out.println("Go! " + this.pokemonActive.getName());
            return true;
        }
    }

    // check if the player black out due to all of the pokemon fainted
    public boolean isBlackOut(){
        int pokemonFainted = 0;

        for (int i = 0; i < 6; i++){
            if (this.pokemonBag.getPokemon().get(i).getHp() == 0){
                ++pokemonFainted;
            }
        }

        if (pokemonFainted == 6){
            blackOut = true;
            return blackOut;
        }else{
            return blackOut;
        }
    }

    // getters
    public PokemonBag getPokemonBag() {
        return pokemonBag;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
    

    public Pokemon getPokemonActive() {
        return pokemonActive;
    }


}
