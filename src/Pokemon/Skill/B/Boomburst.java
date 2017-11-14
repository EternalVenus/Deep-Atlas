package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Boomburst extends Skill{

    public Boomburst() {
        this.name = "Boomburst";
        this.type = new Type("Normal");
        this.ID = "none";
        this.baseDamage  = 140;
        this.description  = "Boomburst deals massive damage and targets all adjacent Pokémon in battle, including allies.";
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
