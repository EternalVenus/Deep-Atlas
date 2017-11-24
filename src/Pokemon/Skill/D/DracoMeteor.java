package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DracoMeteor extends Skill {


    public DracoMeteor() {
        super("Draco Meteor",
                new Type("Dragon"),
                "none",
                130,
                "Draco Meteor deals damage but lowers the user's Special Attack by two stages after attacking.\n" +
                        "Stats can be lowered to a minimum of -6 stages each.\n",
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
