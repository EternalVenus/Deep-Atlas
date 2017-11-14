package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BlueFlare extends Skill{


    public BlueFlare() {
        this.name  = "Blue Flare";
        this.type = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 130;
        this.description = "Blue Flare deals damage and has a 20% chance of burning the target.\n" +
                "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.";
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
