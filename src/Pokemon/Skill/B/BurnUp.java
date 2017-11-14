package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BurnUp extends Skill{

    public BurnUp() {
        this.name= "Burn Up";
        this.type = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 130;
        this.description = "To inflict massive damage, the user burns itself out.\n"+
                "After using this move, the user will no longer be Fire type.\n";
        this.PP = 5;
        this.category = "Special";
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
