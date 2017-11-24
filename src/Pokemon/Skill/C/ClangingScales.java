package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class ClangingScales  extends Skill {


    public ClangingScales() {
        super("Clanging Scales",
                new Type("Dragon"),
                "none",
                110,
                "Clanging Scales deals damage but lowers the user's Defense by one stage after attacking.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
                5,
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
