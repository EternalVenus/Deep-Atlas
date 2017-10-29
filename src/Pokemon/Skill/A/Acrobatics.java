package Skill.A;

import Pokemons.Type;
import Skill.*;


public class Acrobatics  extends Skill{
    private static final String name = "Acrobatics";
    private static final Type type = new Type("Fighting");
    private static final String ID = "TM62";
    private static final int baseDamage = 55;
    private static final String description = "Acrobatics deals damage, however, if the user is not holding an item, its power doubles to 110.\n" +
            "If the user is holding a Flying Gem, it is consumed before the Pokemon attacks, so it receives both boosts and increases Acrobatics' power to 165.\n" +
            "Once the Gem is consumed Acrobatics' power for the rest of the battle will be 110.";

    private int PP;
    public Acrobatics() {
        super();
        this.PP = 15;
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
