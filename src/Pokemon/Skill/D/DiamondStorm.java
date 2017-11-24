package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DiamondStorm extends Skill{
    public DiamondStorm() {
        super("Diamond Storm",
                new Type("Rock"),
                "none",
                100,
                "Diamond Storm deals damage and has a 50% chance of raising the user's Defense by one stage.\n" +
                        "It hits all adjacent opponents in double/triple battles.\n" +
                        "Stats can be raised to a maximum of +6 stages each.",
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
