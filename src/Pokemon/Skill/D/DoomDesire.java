package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DoomDesire extends Skill{
    public DoomDesire() {
        super("Doom Desire",
                new Type("Steel"),
                "none",
                140,
                "Two turns after the move is selected, Doom Desire will deal damage. \n" +
                        "If the opponent switched Pokémon in the meantime, the damage dealt will depend on the \n" +
                        "Special Defense of the Pokémon the move hits, not the Pokémon it was originally targeted at.\n",
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
