package Pokemon.ItemBag.BattleItem.AllBattleItem;

import Pokemon.ItemBag.BattleItem.BattleItem;
import Pokemon.Pokemons.Pokemon;

public class XDefense extends BattleItem{

    public XDefense() {
        super("X Defense",
                550,
                275,
                "They are found in the Celadon Department Store in the Kanto series games along with the Johto games which also have X Defends in the Goldenrod Department Store,\n" +
                        "the Hoenn games have X Defends found in the Lilycove Department Store, Sinnoh has it in the Veilstone Departmant Store,\n" +
                        "and finally the Unova region games have X Defense located in the Dreamyard and the Shopping Mall Nine.\n",
                "X Defend is an item introduced in Generation I that raises the defense of a Pokémon for only a single battle. \n",
                0);
    }

    // a method to add def multiplier to the pokemon
    // the highest amount of def multiplier a pokemon can have is 6
    @Override
    public boolean useBattleItem(Pokemon pokemon) {
        int currentDefMultiplier = pokemon.getDefenseMultiplier() + 2;
        if (pokemon.getDefenseMultiplier() == 6) {
            System.out.println("There is no effect!");
            return false;
        } else if (currentDefMultiplier > 6) {
            // if the battle item increase the multiplier to more than 6
            // set it to 6
            System.out.println("Used a " + super.getName());
            System.out.println("Defense multiplier of " + pokemon.getName() + " is " + 6);
            pokemon.setDefenseMultiplier(6);
            return true;
        }else {
            // anything else. just set the amount after using the battle item
            System.out.println("Used a " + super.getName());
            pokemon.setDefenseMultiplier(currentDefMultiplier);
            System.out.println("Defense multiplier of " + pokemon.getName() + " is " + pokemon.getDefenseMultiplier());
            return true;
        }
    }
}
