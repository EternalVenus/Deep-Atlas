package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DragonClaw extends Skill {
    public DragonClaw() {
        super("Draco Claw",
                new Type("Dragon"),
                "TM02",
                80,
                "Dragon Claw deals damage with no additional effect.\n",
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
