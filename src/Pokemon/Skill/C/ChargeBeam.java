<<<<<<< HEAD
package Skill.C;

import Pokemons.Type;
import Skill.*;

public class ChargeBeam extends Skill {
    private static final String name = "Charge Beam";
    private static final Type type = new Type("Electric");
    private static final String ID = "TM57";
    private static final int baseDamage = 50;
    private static final String description = "Charge Beam deals damage and has a 70% chance of raising the user's Special Attack by one stage.\n" +
            "Stats can be raised to a maximum of +6 stages each.";

    public ChargeBeam() {
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
=======
package Skill.C;

import Pokemons.Type;
import Skill.*;

public class ChargeBeam extends Skill {
    private static final String name = "Charge Beam";
    private static final Type type = new Type("Electric");
    private static final String ID = "TM57";
    private static final int baseDamage = 50;
    private static final String description = "Charge Beam deals damage and has a 70% chance of raising the user's Special Attack by one stage.\n" +
            "Stats can be raised to a maximum of +6 stages each.";

    public ChargeBeam() {
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
>>>>>>> 90693d60b0828c75d3160ae52fc74f69c760d587
