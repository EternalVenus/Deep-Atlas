package Pokemon.ItemBag.Medicine.AllMedicine;

import Pokemon.ItemBag.Medicine.Medicine;
import Pokemon.Pokemons.Pokemon;

public class HyperPotion extends Medicine {
    public HyperPotion() {
        super(  "Hyper Potion",
                "A spray-type medicine for treating wounds.\n" +
                        "It can be used to restore 120 HP to an injured Pokémon.\n",
                "Heals a Pokémon by 120 HP.\n",
                "All Poké Marts (after completing 4 trials)\n",
                750,
                1500,
                0);
    }

    @Override
    public boolean useMedicine(Pokemon pokemon) {
        int currentHpOfPokemon = pokemon.getCurrentHp() + 120;
        if (pokemon.getCurrentHp() == pokemon.getHp()){
            System.out.println("There is no effect.");
            return false;
        }else if(currentHpOfPokemon > pokemon.getHp()){
            // if the potion adds to a amount greater than the max hp. Set the current hp
            // to max hp
            System.out.println("Used a Hyper Potion");
            System.out.println(pokemon.getName() + "'s HP is restored to full.");
            pokemon.setCurrentHp(pokemon.getHp());
            return true;
        }else{
            // anything else. just set the current hp after using the potion
            System.out.println("Used a Hyper Potion");
            System.out.printf(pokemon.getName() + "'s HP is restored to " + currentHpOfPokemon);
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }
    }
}
