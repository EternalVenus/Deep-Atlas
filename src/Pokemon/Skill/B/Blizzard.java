package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Blizzard extends Skill{

    public Blizzard() {
        super("Blizzard",
                new Type("Ice"),
                "TM14",
                110,
                 "Blizzard deals damage and has a 10% chance of freezing the target.\n" +
                "It will hit both opponents in a double battle or adjacent opponents in a triple battle.\n" +
                "Ice type Pokémon, those with the ability Magma Armor or those behind a Substitute cannot be frozen.\n" +
                "During a hailstorm, Blizzard has 100% accuracy.\n",
                5,
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
