package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;


public class Acid extends Skill{
    public Acid() {
            super("Acid",
                    new Type("Poison"),
                    "none",
                    40,
                    "Acid deals damage and has a 10% chance of lowering the target's Special Defense by one stage.\n" +
                            "Stats can be lowered to a minimum of -6 stages each.\n",
                    30,
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
