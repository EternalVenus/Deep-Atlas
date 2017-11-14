package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BlastBurn extends Skill{

    public BlastBurn() {
        this.name = "Blast Burn";
        this.type = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 150;
        this.description = "User must recharge next turn.\n";
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
