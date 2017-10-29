package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Avalanche extends Skill{
    private static final String name = "Avalanche";
    private static final Type type = new Type("Ice");
    private static final String ID = "none";
    private static final int baseDamage = 60;
    private static final String description = "Power doubles if user took damage first.";

    private int PP;
    public Avalanche() {
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
