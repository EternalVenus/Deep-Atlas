package Pokemon.ItemBag.Berries.AllBerry;

import Pokemon.ItemBag.Berries.Berry;
import Pokemon.Pokemons.Pokemon;

public class Sitrus extends Berry{

    public Sitrus() {
        super("Sitrus Berry",
                "A Berry to be consumed by Pokémon.\n" +
                        "If a Pokémon holds one, it can restore its own HP by a small amount during battle.\n",
                32,
                0,
                3.7,
                "Can be found in berry piles in Routes 2, 3, 8, 16, and 17.\n",
                "Very hard\n");
    }

    @Override
    public boolean useBerry(Pokemon pokemon) {
        int currentHpOfPokemon = pokemon.getCurrentHp() + (int)(.25 * pokemon.getHp());
        if (pokemon.getCurrentHp() == pokemon.getHp()){
            System.out.println("There is no effect.");
            return false;
        }else if(currentHpOfPokemon > pokemon.getHp()){
            // if the berry adds to an amount greater than the max hp. Set the current hp
            // to max hp
            System.out.println("Used an Sitrus Berry");
            System.out.println(pokemon.getName() + "'s HP is restored to full.");
            pokemon.setCurrentHp(pokemon.getHp());
            return true;
        }else{
            // anything else. just set the current hp after using the potion
            System.out.println("Used an Sitrus Berry");
            System.out.printf(pokemon.getName() + "'s HP is restored to " + currentHpOfPokemon);
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }
    }
}
