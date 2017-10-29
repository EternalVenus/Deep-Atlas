package Skill.A;

import Pokemons.Type;
import Skill.*;


public class Aeroblast extends Skill{
    private static final String name = "Aeroblast";
    private static final Type type = new Type("Flying");
    private static final String ID = "none";
    private static final int baseDamage = 100;
    private static final String description = "Aeroblast deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).";

    private int PP;
    public Aeroblast() {
        super();
        this.PP = 5;
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
