package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BrutalSwing extends Skill{

    public BrutalSwing() {
        this.name = "Brutal Swing";
        this.type = new Type("Dark");
        this.ID  = "TM59";
        this.baseDamage  = 60;
        this.description = "The user swings its body around violently to inflict damage on everything in its vicinity.\n";
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
