package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DoubleEdge extends Skill{
    public DoubleEdge() {
        super("Double-Edge",
                new Type("Normal"),
                "none",
                120,
                "Double-Edge deals damage, but the user receives 1⁄3 of the damage it inflicted in recoil.\n"  +
                        "In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.\n",
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
