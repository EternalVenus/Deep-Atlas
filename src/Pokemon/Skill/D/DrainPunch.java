package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DrainPunch extends Skill {
    public DrainPunch() {
        super("Drain Punch",
                new Type("Fighting"),
                "TM60",
                50,
                "Drain Punch deals damage and the user will recover 50% of the HP drained.\n" +
                        "If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal).\n" +
                        "If used on a Pokemon with the ability Liquid Ooze, \n"+
                        "the user instead loses the HP it would have otherwise gained.\n",
                10,
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
