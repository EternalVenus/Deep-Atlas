package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BlazeKick extends Skill{

    public BlazeKick() {
        super("Blaze Kick",
                new Type("Fire"),
                "none",
                85,
                "Blaze Kick deals damage and has a 10% chance of burning the target.\n" + 
                "It also has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n" +
                "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.\n" +
                "Pokémon with the abilities Battle Armor or Shell Armor are protected against critical hits.\n",
                10,
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
