package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;


public class Aeroblast extends Skill{


    public Aeroblast() {
        super("Aeroblast",
                new Type("Flying"),
                "none",
                100,
                "Aeroblast deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n",
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
