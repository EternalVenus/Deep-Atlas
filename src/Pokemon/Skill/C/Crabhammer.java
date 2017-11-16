package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Crabhammer extends Skill{


    public Crabhammer() {
        super("Crabhammer",
                new Type("Water"),
                "none",
                100,
                "Crabhammer deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n",
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
