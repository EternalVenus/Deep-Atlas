package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DrainingKiss extends Skill {
    public DrainingKiss() {
        super("Draining Kiss",
                new Type("Fairy"),
                "none",
                50,
                "Draining Kiss deals damage and the user will recover 75% of the HP drained.\n",
                10,
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
