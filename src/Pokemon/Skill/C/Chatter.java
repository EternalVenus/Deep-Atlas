package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class Chatter extends Skill {


    public Chatter() {
        super("Chatter",
                new Type("Flying"),
                "none",
                65,
                "Chatter deals damage and causes the target to become confused.\n" +
                        "Confused Pokémon have a 50% chance of hurting themselves each turn, for 1-4 turns.\n"
                        +  "The damage received is as if the Pokémon attacks itself with a typeless 40 base power Physical attack.\n" +
                        "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.\n",
                20,
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
