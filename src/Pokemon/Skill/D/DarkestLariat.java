package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DarkestLariat extends Skill{
    private static final String name = "Darkest Lariat";
    private static final Type type = new Type("Dark");
    private static final String ID = "none";
    private static final int baseDamage = 85;
    private static final String description = "Darkest Lariat deals damage, but ignores changes to the target's stats (i.e. Defense and Evasion in this case).";

    public DarkestLariat() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 15);
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
