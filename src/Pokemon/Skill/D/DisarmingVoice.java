package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DisarmingVoice extends Skill{
    public DisarmingVoice() {
        super("Disarming Voice",
                new Type("Fairy"),
                "none",
                40,
                "Disarming Voice deals damage and ignores changes to the Accuracy and Evasion stats.\n" +
                        "However, it will not hit Pokémon during the \n"+
                        "invulnerable stage of Bounce, Dig, Dive, Fly, Shadow Force or Sky Drop.",
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
