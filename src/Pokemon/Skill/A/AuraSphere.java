package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class AuraSphere extends Skill{

    public AuraSphere() {
        super("Aura Sphere",
                new Type("Fighting"),
                "none",
                80,
                "Aura Sphere deals damage and ignores changes to the Accuracy and Evasion stats.\n" +
                        "However, it will not hit Pokémon during the invulnerable stage of Bounce,\n" +
                        "Dig, Dive, Fly, Shadow Force or Sky Drop.\n",
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
