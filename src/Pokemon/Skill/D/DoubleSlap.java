package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DoubleSlap extends Skill {
    private static final String name = "Double Slap";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 15;
    private static final String description = "Double Slap hits 2-5 times per turn used. The probability of each interval is shown to the right, with the total power after each hit.\n" +
            "Each strike of Double Slap is treated like a separate attack:\n" +
            "Each strike can get a critical hit independently.\n" +
            "Abilities that activate on contact (Static, Weak Armor, Iron Barbs etc.) activate for each strike.\n" +
            "If the Sturdy ability, Focus Sash, or Focus Band activates before the final hit, the subsequent hit will still deal damage and therefore cause the opponent to faint.\n" +
            "If the first hit breaks a Substitute, the second hit will deal damage to the target Pokémon.\n" +
            "The move Counter only counters the final hit, but Bide counters the complete damage.\n" +
            "The Skill Link ability will cause Double Slap to always hit the maximum number of times.";

    public DoubleSlap() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 10);
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

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public int getBaseDamage() {
        return this.baseDamage;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
