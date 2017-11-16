package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Dig extends Skill{



    public Dig() {
        super("Dig",
                new Type("Ground"),
                "none",
                80,
                "The user of Dig will burrow its way underground on the first turn, disappearing from view and becoming invulnerable to most attacks.\n" +
                        "On the second turn, Dig deals damage.\n" +
                        "While underground, the Pokemon can only be hit by the moves Earthquake, Magnitude or Fissure, with Earthquake and Magnitude dealing twice normal damage.\n" +
                        "Moves from No Guard Pokemon, or any move following an identify move can also hit for regular power.\n " +
                        "The user also avoids end-of-turn damage from Sandstorm and Hail when underground.",
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
