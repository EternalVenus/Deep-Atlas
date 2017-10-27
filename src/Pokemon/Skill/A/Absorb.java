<<<<<<< HEAD
package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Absorb  extends Skill{
    private static final String name = "Absorb";
    private static final Type type = new Type("Grass");
    private static final String ID = "none";
    private static final int baseDamage = 20;
    private static final String description = "Absorb deals damage and the user will recover 50% of the HP drained.\n" +
            "If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal). \n" +
            "If used on a Pokemon with the ability Liquid Ooze, the user instead loses the HP it would have otherwise gained.";

    public Absorb() {
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

public class Absorb  extends Skill{
    private static final String name = "Absorb";
    private static final Type type = new Type("Grass");
    private static final String ID = "none";
    private static final int baseDamage = 20;
    private static final String description = "Absorb deals damage and the user will recover 50% of the HP drained.\n" +
            "If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal). \n" +
            "If used on a Pokemon with the ability Liquid Ooze, the user instead loses the HP it would have otherwise gained.";

    public Absorb() {
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
