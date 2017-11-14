package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class AirSlash extends Skill{

    public AirSlash() {
        super("Air Slash",
                new Type("Flying"),
                "none",
                75,
                "Air Slash deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).\n" +
                "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.\n",
                20,
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
