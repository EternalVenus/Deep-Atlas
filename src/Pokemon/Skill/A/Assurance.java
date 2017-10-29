package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Assurance extends Skill{
    private static final String name = "Assurance";
    private static final Type type = new Type("Dark");
    private static final String ID = "TM62";
    private static final int baseDamage = 60;
    private static final String description = "Assurance deals damage, and if the target has already taken damage in this turn its power doubles to 120.";

    private int PP;
    public Assurance() {
        super();
        this.PP = 10;
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
