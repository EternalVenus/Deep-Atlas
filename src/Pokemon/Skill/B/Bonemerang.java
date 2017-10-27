<<<<<<< HEAD
package Skill.B;

import Pokemons.Type;
import Skill.*;

public class Bonemerang extends Skill{
    private static final String name = "Bonemerang";
    private static final Type type = new Type("Ground");
    private static final String ID = "none";
    private static final int baseDamage = 50;
    private static final String description = "Bonemerang deals damage and will strike twice (with 50 base power each time). Each strike of Bonemerang is treated like a separate attack.";

    public Bonemerang() {
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
package Skill.B;

import Pokemons.Type;
import Skill.*;

public class Bonemerang extends Skill{
    private static final String name = "Bonemerang";
    private static final Type type = new Type("Ground");
    private static final String ID = "none";
    private static final int baseDamage = 50;
    private static final String description = "Bonemerang deals damage and will strike twice (with 50 base power each time). Each strike of Bonemerang is treated like a separate attack.";

    public Bonemerang() {
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
