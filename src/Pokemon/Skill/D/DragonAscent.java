package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DragonAscent extends Skill {
    public DragonAscent() {
        super("Draco Ascent",
                new Type("Dragon"),
                "none",
                120,
                "Dragon Ascent deals damage but lowers the user's Defense and\n" +
                        "Special Defense by one stage each after attacking.\n" +
                        "It is the signature move of Rayquaza, and once learned allows Rayquaza to Mega-Evolve.",
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
