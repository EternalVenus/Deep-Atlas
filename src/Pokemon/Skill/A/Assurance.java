package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Assurance extends Skill{

    public Assurance() {
        super("Assurance",
                new Type("Dark"),
                "TM62",
                60,
                "Assurance deals damage, and if the target has already taken damage \n" +
                        "in this turn its power doubles to 120.\n",
                10,
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
