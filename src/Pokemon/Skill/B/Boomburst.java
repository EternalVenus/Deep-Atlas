package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Boomburst extends Skill{

    public Boomburst() {
        super("Boomburst",
                new Type("Normal"),
                "none",
                140,
                "Boomburst deals massive damage and targets all adjacent Pokémon in battle, including allies.\n",
                10,
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
