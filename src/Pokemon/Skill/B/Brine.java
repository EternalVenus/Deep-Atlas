package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Brine extends Skill{

    public Brine() {
        this.name = "Brine";
        this.type = new Type("Water");
        this.ID = "TM65";
        this.baseDamage  = 110;
        this.description  = "Power doubles if opponent's HP is less than 50%.";
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
