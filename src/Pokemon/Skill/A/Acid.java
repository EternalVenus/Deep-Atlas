package Skill.A;

import Pokemons.Type;
import Skill.*;


public class Acid extends Skill{
    private static final String name = "Acid ";
    private static final Type type = new Type("Poison");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Acid deals damage and has a 10% chance of lowering the target's Special Defense by one stage.\n" +
            "Stats can be lowered to a minimum of -6 stages each.";

    private int PP;

    public Acid() {
        super();
        this.PP = 30;
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
