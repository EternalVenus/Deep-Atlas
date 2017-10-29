package Skill.A;

import Pokemons.Type;
import Skill.*;

public class ArmThrust extends Skill{
    private static final String name = "Arm Thrust";
    private static final Type type = new Type("Fighting");
    private static final String ID = "none";
    private static final int baseDamage = 15;
    private static final String description = "Arm Thrust hits 2-5 times per turn used. The probability of each interval is shown to the right, with the total power after each hit.";

    private int PP;


    public ArmThrust() {
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
