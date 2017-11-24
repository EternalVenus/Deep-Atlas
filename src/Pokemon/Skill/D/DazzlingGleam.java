package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DazzlingGleam extends Skill{

    public DazzlingGleam() {
        super("Dazzling Gleam",
                new Type("Fairy"),
                "TM99",
                80,
                "Dazzling Gleam deals damage and hits all adjacent opponents in double/triple battles.\n",
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
