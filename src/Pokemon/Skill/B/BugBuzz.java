package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BugBuzz extends Skill{

    public BugBuzz() {
        this.name = "Bug Buzz";
        this.type = new Type("Bug");
        this.ID  = "none";
        this.baseDamage = 90;
        this.description = "Bug Buzz deals damage and has a 10% chance of lowering the target's Special Defense by one stage.\n" +
                "Stats can be lowered to a minimum of -6 stages each.";
        this.PP = 10;
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
