package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DiamondStorm extends Skill{
    private static final String name = "Diamond Storm";
    private static final Type type = new Type("Rock");
    private static final String ID = "none";
    private static final int baseDamage = 100;
    private static final String description = "Diamond Storm deals damage and has a 50% chance of raising the user's Defense by one stage.\n" +
            "It hits all adjacent opponents in double/triple battles.\n" +
            "Stats can be raised to a maximum of +6 stages each.";

    public DiamondStorm() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 5);
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
