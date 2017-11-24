package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class BurnUp extends Skill{

    public BurnUp() {
        super("Burn Up",
                new Type("Fire"),
                "none",
                130,
                 "To inflict massive damage, the user burns itself out.\n"+
                "After using this move, the user will no longer be Fire type.\n",
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
