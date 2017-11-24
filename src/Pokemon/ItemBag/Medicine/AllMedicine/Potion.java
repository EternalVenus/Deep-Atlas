package Pokemon.ItemBag.Medicine.AllMedicine;

import Pokemon.ItemBag.Medicine.Medicine;
import Pokemon.Pokemons.Pokemon;

public class Potion extends Medicine {
    public Potion() {
        super("Potion",
                "A spray-type medicine for treating wounds.\n" +
                        "It can be used to restore 20 HP to an injured Pokémon.\n",
                "Heals a Pokémon by 20 HP.\n",
                "All Poké Marts\n",
                100,
                200,
                0);
    }

    @Override
    public boolean useMedicine(Pokemon pokemon) {
        int currentHpOfPokemon = pokemon.getCurrentHp() + 20;
        if (pokemon.getCurrentHp() == pokemon.getHp()){
            System.out.println("There is no effect.");
            return false;
        }else if(currentHpOfPokemon > pokemon.getHp()){
            System.out.println("Used a Potion");
            System.out.println(pokemon.getName() + "'s HP is restored to full.");
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }else{
            System.out.println("Used a Potion");
            System.out.printf(pokemon.getName() + "'s HP is restored to " + currentHpOfPokemon);
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }
    }
}
