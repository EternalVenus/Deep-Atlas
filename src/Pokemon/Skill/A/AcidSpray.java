package Skill.A;

import Pokemons.Type;
import Skill.*;


public class AcidSpray  extends Skill{
    private static final String name = "Acid Spray";
    private static final Type type = new Type("Poison");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Acid Spray inflicts damage and lowers the target's Special Defense by two stages.\n" +
            "Stats can be lowered to a minimum of -6 stages each.";

    private int PP;

    public AcidSpray() {
        super();
        this.PP = 20;
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

    public String getName() {
        return name;
    }


    public Type getType() {
        return type;
    }


    public int getBaseDamage() {
        return baseDamage;
    }


    public String getDescription() {
        return description;
    }

    public int getPP() {
        return PP;
    }
}
