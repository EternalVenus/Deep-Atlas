package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BlastBurn extends Skill{

    public BlastBurn() {
        super("Blast Burn",
                new Type("Fire"),
                "none",
                150,
                "User must recharge next turn.\n",
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
