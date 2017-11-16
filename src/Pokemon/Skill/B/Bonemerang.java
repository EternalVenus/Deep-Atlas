package Pokemon.Skill.B;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Bonemerang extends Skill{

    public Bonemerang() {
        super("Bonemerang",
                new Type("Ground"),
                "none",
                50,
                "Bonemerang deals damage and will strike twice (with 50 base power each time).\n" +
                "Each strike of Bonemerang is treated like a separate attack.\n",
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
