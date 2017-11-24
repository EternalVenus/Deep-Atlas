package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DragonBreath extends Skill {
    public DragonBreath() {
        super("Draco Breath",
                new Type("Dragon"),
                "TM24",
                60,
                "Dragon Breath deals damage and has a 30% chance of paralyzing the target.\n" +
                        "Electric type Pokémon, those with the ability \n" +
                        "Limber or those behind a Substitute cannot be paralyzed.\n",
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
