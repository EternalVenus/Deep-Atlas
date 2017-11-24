package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;


public class AcidSpray  extends Skill{

    public AcidSpray() {
        super("Acid Spray",
                new Type("Poison"),
                "none",
                40,
                "Acid Spray inflicts damage and lowers the target's Special Defense by two stages.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
                20,
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
