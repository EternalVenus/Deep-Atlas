package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Confusion extends Skill{

    public Confusion() {
        super("Confusion",
                new Type("Psychic"),
                "none",
                50,
                "Confusion deals damage and has a 10% chance of confusing the target.\n" +
                        "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.\n",
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
