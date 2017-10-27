package Skill.A;

import Pokemons.Type;
import Skill.*;

public class ArmThrust extends Skill{
    private static final String name = "Arm Thrust";
    private static final Type type = new Type("Fighting");
    private static final String ID = "none";
    private static final int baseDamage = 15;
    private static final String description = "Arm Thrust hits 2-5 times per turn used. The probability of each interval is shown to the right, with the total power after each hit.";

    public ArmThrust() {
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
