package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Bite extends Skill{

    public Bite() {
        this.name = "Bite";
        this.type = new Type("Dark");
        this.ID = "none";
        this.baseDamage = 60;
        this.description  = "Bite deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).\n" +
                "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.";
        this.PP = 25;
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
