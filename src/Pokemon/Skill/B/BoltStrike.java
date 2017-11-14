package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BoltStrike extends Skill{

    public BoltStrike() {
        this.name = "Bolt Strike";
        this.type = new Type("Electric");
        this.ID = "none";
        this.baseDamage = 130;
        this.description = "Bolt Strike deals damage and has a 20% chance of paralyzing the target.\n" +
                "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.";
        this.PP = 5;
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
