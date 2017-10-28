package Skill.C;

import Pokemons.Type;
import Skill.*;

public class ChipAway extends Skill {
    private static final String name = "Chip Away";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 70;
    private static final String description = "Chip Away deals damage, but ignores changes to the target's stats (i.e. Defense and Evasion in this case).\n" +
            "Note this does not include the effects of screens like Reflect as they are different to regular stat boosts.";

    public ChipAway() {
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
