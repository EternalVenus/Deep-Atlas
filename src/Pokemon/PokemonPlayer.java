package Pokemon;

import java.util.Collections;

import Pokemon.ItemBag.Bag;
import Pokemon.Pokemons.Pokemon;

public class PokemonPlayer {
    private String name;
    private String gender;
    private PokemonBag pokemonBag;
    private Bag itembag;
    private int money;
    private Pokemon pokemonActive;

    public PokemonPlayer(String name, String gender, PokemonBag pokemonBag, Bag itembag) {
        this.name = name;
        this.gender = gender;
        this.pokemonBag = pokemonBag;
        this.itembag = itembag;
        this.money = 0;
        // Active pokemon is the first pokemon in the bag
        this.pokemonActive = pokemonBag.getPokemon().get(0);
    }

    // switches to a pokemon in the bag using its index value
    public boolean switchPokemon(int num){
        if (num < 0 || num > 5){
            System.out.println("There are only 6 pokemon (0 - 5) ");
            return false;
        }else if(num == 0){
            // Telling the player the first pokemon in the bag is already in battle
            if (this.pokemonBag.getPokemon().get(0).getCurrentHp() == 0){
                System.out.println(this.pokemonBag.getPokemon().get(0).getName() + " fainted. Choose another pokemon!");
                return false;
            }else {
                System.out.println(this.pokemonBag.getPokemon().get(0).getName() + " is already on the battle field.");
                return false;
            }
        }
        else{
            // checks if the pokemon is a fainted pokemon before switching
            // if the pokemon is a fainted pokemon
            if (this.pokemonBag.getPokemon().get(num).getCurrentHp() == 0){
                System.out.println(this.pokemonBag.getPokemon().get(num).getName() + " is unable to battle. Choose a different pokemon.");
                return false;
            }else{
                // if the pokemon is not fainted
                // swaps the 2 pokemon in the pokemon bag
                System.out.println(this.pokemonActive.getName() + " return.");
                Collections.swap(this.pokemonBag.getPokemon(), 0, num);
                this.pokemonActive = this.pokemonBag.getPokemon().get(0);
                System.out.println("Go! " + this.pokemonActive.getName());
                return true;
            }

        }
    }

    // This method chooses the active pokemon based on the first non-zero current hp pokemon
    // mainly used for player battle. (Enemy Player)
    public void chooseActivePokemon(){
        for (int i = 0; i <  this.pokemonBag.getPokemon().size(); i++){
            if (this.pokemonBag.getPokemon().get(i).getCurrentHp() != 0){
                setPokemonActive(this.pokemonBag.getPokemon().get(i));
            }
        }
        System.out.println(this.getName() + " chooses " + this.getPokemonActive().getName());
    }


    // check if the player black out due to all of the pokemon fainted
    public boolean isBlackOut(){
        int pokemonFainted = 0;

        for (int i = 0; i < this.pokemonBag.getPokemon().size(); i++){
            if (this.pokemonBag.getPokemon().get(i).getCurrentHp() == 0){
                ++pokemonFainted;
            }
        }

        if (pokemonFainted == this.pokemonBag.getPokemon().size()){
            return true;
        }else{
            return false;
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

    public Bag getItembag() {
        return itembag;
    }

    public Pokemon getPokemonActive() {
        return pokemonActive;
    }

    public void setPokemonActive(Pokemon pokemonActive) {
        this.pokemonActive = pokemonActive;
    }
}
