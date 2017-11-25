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
            System.out.println("\t\t\t\t\tThere is no effect ꒰ ꒪⌑꒪꒱˖ꂚ*ᵎ");
            return false;
        }else if(currentHpOfPokemon > pokemon.getHp()){
            System.out.println("\t\t\t\t\t\tД Used a Potion Д");
            System.out.println("\t\t\t\t" + pokemon.getName() + "'s HP is restored to full ♥");
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }else{
            System.out.println("\t\t\t\t\t\tД Used a Potion Д");
            System.out.println("\t\t\t\t" + pokemon.getName() + "'s HP is restored to " + currentHpOfPokemon + " ♥");
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }
    }
}
