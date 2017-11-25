package Pokemon.ItemBag.BattleItem.AllBattleItem;

import Pokemon.ItemBag.BattleItem.BattleItem;
import Pokemon.Pokemons.Pokemon;

public class XAttack extends BattleItem{
    public XAttack() {
        super("X Attack",
                500,
                250,
                "This item can mainly be found in the following city's department stores: Celadon City,\n" +
                        "Goldenrod City, Lilycove City, Veilstone City and Shopping Mall Nine.\n",
                "X Attack is an stat-giving item introduced in Generation I that raises a Pokémon's attack stat for only one battle.\n",
                0);
    }

    // a method to add atk multiplier to the pokemon
    // the highest amount of atk multiplier a pokemon can have is 6
    @Override
    public boolean useBattleItem(Pokemon pokemon) {
        int currentAtkMultiplier = pokemon.getAtkMultiplier() + 2;
        if (pokemon.getAtkMultiplier() == 6) {
            System.out.println("There is no effect!");
            return false;
        } else if (currentAtkMultiplier > 6) {
            // if the battle item increase the multiplier to more than 6
            // set it to 6
            System.out.println("Used a " + super.getName());
            System.out.println("Attack multiplier of " + pokemon.getName() + " is " + 6);
            pokemon.setAtkMultiplier(6);
            return true;
        }else {
            // anything else. just set the amount after using the battle item
            System.out.println("Used a " + super.getName());
            pokemon.setAtkMultiplier(currentAtkMultiplier);
            System.out.println("Attack multiplier of " + pokemon.getName() + " is " + pokemon.getAtkMultiplier());
            return true;
        }
    }
}
