package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Bubble extends Skill{

    public Bubble() {
        this.name = "Bubble";
        this.type = new Type("Water");
        this.ID = "none";
        this.baseDamage = 40;
        this.description = "Bubble deals damage and has a 10% chance of lowering the target's Speed by one stage. \n";
        this.PP = 30;
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
