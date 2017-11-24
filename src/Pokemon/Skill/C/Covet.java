package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class Covet extends Skill{

    public Covet() {
        super("Covet",
                new Type("Normal"),
                "none",
                60,
                "Covet deals damage and steals the target's held item, if the user is not already holding an item.\n" +
                        "Items stolen from wild Pokémon are kept after the battle ends, but items stolen from a Trainer's Pokémon are not.\n" +
                        "Items stolen from the player's Pokémon, either by wild Pokémon or Trainer Pokémon, are returned at the end of the battle.\n" +
                        "All held items in wi-fi/linked battles (including Battle Tower/Subway/Maison)\n" +
                        "are returned to their respective owners at the end of a battle.\n",
                25,
                "Physical"
        );
    }

    @Override
    public int effect(Pokemon pokemon) {
        return super.effect(pokemon);
    }

    @Override
    public int defenseEffect(Pokemon pokemon) {
        return super.defenseEffect(pokemon);
    }

    @Override
    public int speedEffect(Pokemon pokemon) {
        return super.speedEffect(pokemon);
    }
}
