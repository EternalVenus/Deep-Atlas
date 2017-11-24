package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class Catastropika extends Skill {
    public Catastropika() {
        super("Catastropika",
                new Type("Electric"),
                "none",
                210,
                "Catastropika is a Z-Move exclusive to Pikachu. \n" +
                        "It can only be used with Volt Tackle.\n",
                1,
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
