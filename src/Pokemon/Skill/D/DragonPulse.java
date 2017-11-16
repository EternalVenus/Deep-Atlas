package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DragonPulse extends Skill {
    public DragonPulse() {
        super("Draco Pulse",
                new Type("Dragon"),
                "none",
                85,
                "Dragon Pulse deals damage with no additional effect.\n",
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
