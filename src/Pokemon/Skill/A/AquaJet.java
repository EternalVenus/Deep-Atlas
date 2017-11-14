package Pokemon.Skill.A;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class AquaJet extends Skill{
    public AquaJet() {
        super("Aqua Jet",
                new Type("Water"),
                "none",
                40,
                "Aqua Jet deals damage and has a priority of +1.\n" +
                        "Moves with a higher priority always go first, regardless of a Pokémon's speed.\n"+
                        "If two moves with the same priority are used, the faster Pokémon goes first as usual.\n",
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
