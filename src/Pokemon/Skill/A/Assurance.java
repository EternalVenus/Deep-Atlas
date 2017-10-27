package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Assurance extends Skill{
    private static final String name = "Assurance";
    private static final Type type = new Type("Dark");
    private static final String ID = "TM62";
    private static final int baseDamage = 60;
    private static final String description = "Assurance deals damage, and if the target has already taken damage in this turn its power doubles to 120.";

    public Assurance() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description);
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
