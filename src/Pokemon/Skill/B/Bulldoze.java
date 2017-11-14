package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Bulldoze extends Skill{

    public Bulldoze() {
        this.name  = "Bulldoze";
        this.type  = new Type("Ground");
        this.ID = "TM78";
        this.baseDamage = 60;
        this.description  = "Bulldoze deals damage and lowers the target's Speed by one stage.\n" +
                "Stats can be lowered to a minimum of -6 stages each.";
        this.PP = 20;
        this.category = "Physical";
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
