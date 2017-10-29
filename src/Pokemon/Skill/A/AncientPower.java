package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AncientPower  extends Skill{
    private static final String name = "Ancient Power ";
    private static final Type type = new Type("Rock");
    private static final String ID = "none";
    private static final int baseDamage = 60;
    private static final String description = "Ancient Power deals damage and has a 10% chance of raising all the user's stats at once - Attack, Defense, Special Attack, Special Defense and Speed - by one stage each.\n" +
            "Stats can be raised to a maximum of +6 stages each.";

    private int PP;
    public AncientPower() {
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
