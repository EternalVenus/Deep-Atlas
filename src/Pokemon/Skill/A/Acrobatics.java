package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;


public class Acrobatics  extends Skill{

    public Acrobatics() {
        super("Acrobatics",
                new Type("Fighting"),
                "TM62",
                55,
                "Acrobatics deals damage, however, if the user is not holding an item, its power doubles to 110.\n" +
                        "If the user is holding a Flying Gem, it is consumed before the IPokemon attacks, so it receives both boosts and increases Acrobatics' power to 165.\n" +
                        "Once the Gem is consumed Acrobatics' power for the rest of the battle will be 110.\n",
                15,
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
