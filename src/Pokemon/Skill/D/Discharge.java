package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Discharge extends Skill{
    public Discharge() {
        super("Discharge",
                new Type("Electric"),
                "none",
                80,
                "Discharge deals damage and has a 30% chance of paralyzing the target(s).\n" +
                        "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.\n",
                15,
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
