<<<<<<< HEAD
package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AquaTail  extends Skill{
    private static final String name = "Aqua Tail";
    private static final Type type = new Type("Water");
    private static final String ID = "none";
    private static final int baseDamage = 90;
    private static final String description = "Aqua Tail deals damage with no additional effect.";

    public AquaTail() {
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

public class AquaTail  extends Skill{
    private static final String name = "Aqua Tail";
    private static final Type type = new Type("Water");
    private static final String ID = "none";
    private static final int baseDamage = 90;
    private static final String description = "Aqua Tail deals damage with no additional effect.";

    public AquaTail() {
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
