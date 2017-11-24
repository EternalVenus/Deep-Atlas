package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class CometPunch extends Skill{


    public CometPunch() {
        super("Comet Punch",
                new Type("Normal"),
                "none",
                18,
                "Comet Punch hits 2-5 times per turn used.\n" +
                        "The probability of each interval is shown to the right, with the total power after each hit.\n",
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
