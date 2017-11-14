package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BodySlam extends Skill{

    public BodySlam() {
        this.name = "Body Slam";
        this.type = new Type("Normal");
        this.ID = "TM08";
        this.baseDamage = 85;
        this.description = "Body Slam deals damage and has a 30% chance of paralyzing the target.\n" +
                "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.";
        this.PP = 15;
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
