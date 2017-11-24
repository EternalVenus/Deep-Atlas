package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DragonRush extends Skill {
    public DragonRush() {
        super("Draco Rush",
                new Type("Dragon"),
                "none",
                100,
                "Dragon Rush deals damage and has a 20% chance of causing the target to flinch (if the target has not yet moved).\n" +
                        "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.\n",
                10,
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
