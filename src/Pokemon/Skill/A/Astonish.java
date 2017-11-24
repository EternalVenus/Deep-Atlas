package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class Astonish extends Skill{
    public Astonish() {
        super("Astonish",
                new Type("Ghost"),
                "none",
                30,
                "Astonish deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).\n" +
                        "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.\n",
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
