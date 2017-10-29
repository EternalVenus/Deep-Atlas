package Skill.C;

import Pokemons.Type;
import Skill.*;

public class CrushClaw extends Skill{
    private static final String name = "Crush Claw";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 75;
    private static final String description = "Crush Claw deals damage and has a 50% chance of lowering the target's Defense by one stage.\n" +
            "Stats can be lowered to a minimum of -6 stages each.";

    public CrushClaw() {
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
