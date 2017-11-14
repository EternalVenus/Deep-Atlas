package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class AquaTail  extends Skill{

    public AquaTail() {
        super("Aqua Tail",
                new Type("Water"),
                "none",
                90,
                "Aqua Tail deals damage with no additional effect.\n",
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
