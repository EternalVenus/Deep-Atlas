package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class AncientPower  extends Skill{

    public AncientPower() {
        super("Ancient Power",
                new Type("Rock"),
                "none",
                60,
                "Ancient Power deals damage and has a 10% chance of raising all the user's stats at once\n" +
                        "- Attack, Defense, Special Attack, Special Defense and Speed - by one stage each.\n" +
                        "Stats can be raised to a maximum of +6 stages each.\n",
                5,
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
