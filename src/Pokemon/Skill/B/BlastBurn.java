package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BlastBurn extends Skill{
    private static final String name = "Blast Burn";
    private static final Type type = new Type("Fire");
    private static final String ID = "none";
    private static final int baseDamage = 150;
    private static final String description = "User must recharge next turn.\n";

    public BlastBurn() {
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