package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DrillPeck extends Skill {
    public DrillPeck() {
        super("Drill Peck",
                new Type("Flying"),
                "none",
                80,
                "Drill Peck deals damage with no additional effect, \n" +
                        "besides being able to hit non-adjacent Pokémon in triple battles.\n",
                20,
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
