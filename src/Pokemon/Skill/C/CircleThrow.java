package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class CircleThrow  extends Skill {


    public CircleThrow() {
        super("Circle Throw",
                new Type("Fighting"),
                "none",
                60,
                "In battles, the opponent switches. In the wild, the Pokémon runs.\n",
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
