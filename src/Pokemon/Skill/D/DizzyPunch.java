package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DizzyPunch extends Skill{


    public DizzyPunch() {
        super("Dizzy Punch",
                new Type("Normal"),
                "none",
                70,
                "Dizzy Punch deals damage and has a 20% chance of confusing the target.\n" +
                        "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.\n",
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
