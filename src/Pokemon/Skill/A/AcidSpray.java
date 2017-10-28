package Skill.A;

import Pokemons.Type;
import Skill.*;


public class AcidSpray  extends Skill{
    private static final String name = "Acid Spray";
    private static final Type type = new Type("Poison");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Acid Spray inflicts damage and lowers the target's Special Defense by two stages.\n" +
            "Stats can be lowered to a minimum of -6 stages each.";

    public AcidSpray() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 20);
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
