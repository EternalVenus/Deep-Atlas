package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemons.Pokemon;

public class DoubleKick extends Skill {
    public DoubleKick() {
        super("Double Kick",
                new Type("Fighting"),
                "none",
                30,
                "Double Kick deals damage and will strike twice (with 30 base power each time). Each strike of Double Kick is treated like a separate attack:\n" +
                        "Each strike can get a critical hit independently.\n" +
                        "Abilities that activate on contact (Static, Weak Armor, Iron Barbs etc.) activate for each strike.\n" +
                        "If the Sturdy ability, Focus Sash, or Focus Band activates before the final hit, the \n" +
                        "subsequent hit will still deal damage and therefore cause the opponent to faint.\n" +
                        "If the first hit breaks a Substitute, the second hit will deal damage to the target Pokémon.\n" +
                        "The move Counter only counters the final hit, but Bide counters the complete damage.\n",
                30,
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
