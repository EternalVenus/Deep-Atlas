package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BubbleBeam extends Skill{


    public BubbleBeam() {
        this.name = "Bubble Beam";
        this.type = new Type("Water");
        this.ID = "TM11";
        this.baseDamage  = 65;
        this.description  = "Bubble Beam deals damage and has a 10% chance of lowering the target's Speed by one stage.\n" +
                "Stats can be lowered to a minimum of -6 stages each.\n";
        this.PP = 20;
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
