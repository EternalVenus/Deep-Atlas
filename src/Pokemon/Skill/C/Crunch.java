package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class Crunch extends Skill{


    public Crunch() {
        super("Crunch",
                new Type("Dark"),
                "none",
                80,
                "Crunch deals damage and has a 20% chance of lowering the target's Defense by one stage.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
                15,
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
