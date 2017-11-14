package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Barrage extends Skill{

    public Barrage() {
        this.name = "Barrage";
        this.type = new Type("Normal");
        this.ID = "none";
        this.baseDamage = 15;
        this.description = "Barrage hits 2-5 times per turn used.\n" +
                "The probability of each interval is shown to the right, with the total power after each hit.";
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
