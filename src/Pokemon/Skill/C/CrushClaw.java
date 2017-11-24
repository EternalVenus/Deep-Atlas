package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class CrushClaw extends Skill{

    public CrushClaw() {
        super("Crush Claw",
                new Type("Normal"),
                "none",
                75,
                "Crush Claw deals damage and has a 50% chance of lowering the target's Defense by one stage.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
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
