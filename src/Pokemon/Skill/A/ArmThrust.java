package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class ArmThrust extends Skill{

    public ArmThrust() {
        super("Arm Thrust",
                new Type("Fighting"),
                "none",
                15,
                "Arm Thrust hits 2-5 times per turn used.\n" +
                        "The probability of each interval is shown to the right, with the total power after each hit.\n",
                20,
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
