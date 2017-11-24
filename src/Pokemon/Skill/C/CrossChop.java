package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class CrossChop extends Skill{


    public CrossChop(){
        super("Cross Chop",
                new Type("Fighting"),
                "none",
                100,
                "Cross Chop deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n",
                5,
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
