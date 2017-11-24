package Pokemon.Skill.C;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class ChargeBeam extends Skill {
    public ChargeBeam() {
        super("Charge Beam",
                new Type("Electric"),
                "TM57",
                50,
                "Charge Beam deals damage and has a 70% chance of raising the user's Special Attack by one stage.\n" +
                        "Stats can be raised to a maximum of +6 stages each.\n",
                10,
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
