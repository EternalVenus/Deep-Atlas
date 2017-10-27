package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AuroraBeam extends Skill{
    private static final String name = "Aurora Beam";
    private static final Type type = new Type("Ice");
    private static final String ID = "none";
    private static final int baseDamage = 65;
    private static final String description = "Aurora Beam deals damage and has a 10% chance of lowering the target's Attack by one stage.\n" +
            "Stats can be lowered to a minimum of -6 stages each.";

    public AuroraBeam() {
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
