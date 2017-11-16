package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BoneRush extends Skill{

    public BoneRush() {
        
        super("Bone Rush",
                new Type("Ground"),
                "none",
                25,
                "Bone Rush hits 2-5 times per turn used.\n" +
                "The probability of each interval is shown to the right, with the total power after each hit.\n",
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
