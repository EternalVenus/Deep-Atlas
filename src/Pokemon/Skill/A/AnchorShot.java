package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class AnchorShot extends Skill {

    public AnchorShot() {
        super("Anchor Shot",
                new Type("Steel"),
                "none",
                80,
                "The user entangles the target with its anchor chain while attacking.\n" +
                        "The target becomes unable to flee.\n",
                20,
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
