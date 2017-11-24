package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DynamicPunch extends Skill {
    public DynamicPunch() {
        super("Dynamic Punch",
                new Type("Fighting"),
                "TM01",
                100,
                "Dynamic Punch deals damage and confuses the target,\n" +
                        "if it hits. Confused Pokémon have a 50% chance of hurting themselves each turn, for 1-4 turns.\n" +
                        "The damage received is as if the Pokémon attacks itself with a typeless 40 base power Physical attack.\n" +
                        "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.\n",
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
