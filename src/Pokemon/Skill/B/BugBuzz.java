package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BugBuzz extends Skill{
    private static final String name = "Bug Buzz";
    private static final Type type = new Type("Bug");
    private static final String ID = "none";
    private static final int baseDamage = 90;
    private static final String description = "Bug Buzz deals damage and has a 10% chance of lowering the target's Special Defense by one stage.\n" +
            "Stats can be lowered to a minimum of -6 stages each.";

    public BugBuzz() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 10);
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