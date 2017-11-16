package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Dive extends Skill{
    public Dive() {
        super("Dive",
                new Type("Water"),
                "HM07",
                80,
                "The user of Dive will hide underwater on the first turn, disappearing from view and becoming invulnerable to most attacks.\n" +
                        "On the second turn, Dive deals damage.\n" +
                        "While underwater, the Pokemon can only be hit by the moves Surf, Whirlpool or Low Kick, with Surf and Whirlpool dealing twice normal damage.\n" +
                        "Moves from No Guard Pokemon, or any move following an identify move can also hit for regular power.\n" +
                        "The user also avoids end-of-turn damage from Sandstorm and Hail when underwater.\n" +
                        "If the user is holding a Power Herb, Dive executes in one turn.",
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
