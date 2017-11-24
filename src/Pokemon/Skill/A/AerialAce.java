package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class AerialAce extends Skill{

    public AerialAce() {
        super("Aerial Ace",
                new Type("Flying"),
                "TM40",
                60,
                "Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats.\n"+
                        "However, it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly, \n" +
                        "Shadow Force or Sky Drop.\n",
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
