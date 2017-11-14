package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class AuroraBeam extends Skill{

    public AuroraBeam() {
        super("Aurora Beam",
                new Type("Ice"),
                "none",
                65,
                "Aurora Beam deals damage and has a 10% chance of lowering the target's Attack by one stage.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
                20,
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
