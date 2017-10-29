package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AquaTail  extends Skill{
    private static final String name = "Aqua Tail";
    private static final Type type = new Type("Water");
    private static final String ID = "none";
    private static final int baseDamage = 90;
    private static final String description = "Aqua Tail deals damage with no additional effect.";

    private int PP;

    public AquaTail() {
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
