package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DarkestLariat extends Skill {


    public DarkestLariat() {
        super("Darkest Lariat",
                new Type("Dark"),
                "none",
                85,
                "Darkest Lariat deals damage, but ignores changes to the target's\n" +
                        "stats (i.e. Defense and Evasion in this case). \n",
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
