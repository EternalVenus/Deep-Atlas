package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class ChipAway extends Skill {
    public ChipAway() {
        super("Chip Away",
                new Type("Normal"),
                "none",
                70,
                "Chip Away deals damage, but ignores changes to the target's stats (i.e. Defense and Evasion in this case).\n" +
                        "Note this does not include the effects of screens like Reflect as they are different to regular stat boosts.\n",
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
