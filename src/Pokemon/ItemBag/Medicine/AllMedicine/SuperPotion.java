package Pokemon.ItemBag.Medicine.AllMedicine;

import Pokemon.ItemBag.Medicine.Medicine;
import Pokemon.Pokemons.Pokemon;

public class SuperPotion extends Medicine {
    public SuperPotion() {
        super(  "Super Potion",
                "A spray-type medicine for treating wounds.\n" +
                        "It can be used to restore 60 HP to an injured Pokémon.\n",
                "Heals a Pokémon by 60 HP.\n",
                "All Poké Marts (after completing 1 trial)\n",
                350,
                700,
                0);
    }

    @Override
    public boolean useMedicine(Pokemon pokemon) {
        int currentHpOfPokemon = pokemon.getCurrentHp() + 60;
        if (pokemon.getCurrentHp() == pokemon.getHp()){
            System.out.println("\t\t\t\t\tThere is no effect ꒰ ꒪⌑꒪꒱˖ꂚ*ᵎ");
            return false;
        }else if(currentHpOfPokemon > pokemon.getHp()){
            // if the potion adds to a amount greater than the max hp. Set the current hp
            // to max hp
            System.out.println("\t\t\t\t\t\tД Used a Super Potion Д");
            System.out.println("\t\t\t\t" + pokemon.getName() + "'s HP is restored to full ♥");
            pokemon.setCurrentHp(pokemon.getHp());
            return true;
        }else{
            // anything else. just set the current hp after using the potion
            System.out.println("\t\t\t\t\t\tД Used a Super Potion Д");
            System.out.println("\t\t\t\t" + pokemon.getName() + "'s HP is restored to " + currentHpOfPokemon + " ♥");
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }
    }

}
