package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BlueFlare extends Skill{


    public BlueFlare() {
        super("Blue Flare",
                new Type("Fire"),
                "none",
                130,
                "Blue Flare deals damage and has a 20% chance of burning the target.\n" +
                "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.\n",
                5,
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
