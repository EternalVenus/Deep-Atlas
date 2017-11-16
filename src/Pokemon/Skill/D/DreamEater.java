package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DreamEater extends Skill{
    public DreamEater() {
        super("Dream Eater",
                new Type("Psychic"),
                "TM42",
                100,
                "Dream Eater deals damage only on sleeping foes and the user will recover 50% of the HP drained.\n" +
                        "If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal). \n"+
                        "If used on a Pokemon with the ability Liquid Ooze, the user instead loses the HP it would have otherwise gained.\n",
                15,
                "Special"
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
