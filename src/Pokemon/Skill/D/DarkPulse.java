package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DarkPulse extends Skill{


    public DarkPulse() {
        super("Dark Pulse",
                new Type("Dark"),
                "TM79",
                80,
                "Dark Pulse deals damage and has a 20% chance of causing\n" +
                        "the target to flinch (if the target has not yet moved).\n" +
                        "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.\n",
                15,
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
