<<<<<<< HEAD
package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AncientPower  extends Skill{
    private static final String name = "Ancient Power ";
    private static final Type type = new Type("Rock");
    private static final String ID = "none";
    private static final int baseDamage = 60;
    private static final String description = "Ancient Power deals damage and has a 10% chance of raising all the user's stats at once - Attack, Defense, Special Attack, Special Defense and Speed - by one stage each.\n" +
            "Stats can be raised to a maximum of +6 stages each.";

    public AncientPower() {
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
package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AncientPower  extends Skill{
    private static final String name = "Ancient Power ";
    private static final Type type = new Type("Rock");
    private static final String ID = "none";
    private static final int baseDamage = 60;
    private static final String description = "Ancient Power deals damage and has a 10% chance of raising all the user's stats at once - Attack, Defense, Special Attack, Special Defense and Speed - by one stage each.\n" +
            "Stats can be raised to a maximum of +6 stages each.";

    public AncientPower() {
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
