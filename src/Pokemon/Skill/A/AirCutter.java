package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class AirCutter extends Skill{
    public AirCutter() {
        super("Air Cutter",
                new Type("Flying"),
                "none",
                60,
                "Air Cutter deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n",
                25,
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
