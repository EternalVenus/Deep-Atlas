package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BeakBlast extends Skill{


    public BeakBlast() {
        super("Beak Blast",
                new Type("Flying"),
                "none",
                100,
                 "The user first heats up its beak, and then it attacks the target.\n"+
                "Making direct contact with the Pokémon while it’s heating up its beak results in a burn.\n",
                15,
                "Physical"
                ); 
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
