package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class Belch extends Skill{
    public Belch() {
        super("Belch",
                new Type("Poison"),
                "none",
                120,
                 "Belch deals damage, but only works if the user has previously consumed a Berries during the battle.\n" +
                "Manually feeding a Berries from the bag does not count.\n",
                10,
                "Special"
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
