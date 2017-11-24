package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class CloseCombat extends Skill{

    public CloseCombat() {
        super("Close Combat",
                new Type("Fighting"),
                "none",
                120,
                "Close Combat deals damage but lowers the user's Defense and Special Defense by one stage each after attacking.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
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
