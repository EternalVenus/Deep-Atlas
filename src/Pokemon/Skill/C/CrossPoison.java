package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class CrossPoison extends Skill{

    public CrossPoison() {
        super("Cross Poison",
                new Type("Poison"),
                "none",
                70,
                "Cross Poison deals damage and has a 10% chance of poisoning the target.\n" +
                        "It also has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n" +
                        "Poison or Steel type Pokémon, those with the ability Immunity or those behind a Substitute cannot be poisoned.\n",
                20,
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
