package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Constrict extends Skill{

    public Constrict() {
        super("Constrict",
                new Type("Normal"),
                "none",
                10,
                "Constrict deals damage and has a 10% chance of lowering the target's Speed by one stage.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
                35,
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
