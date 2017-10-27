<<<<<<< HEAD
package Skill.B;

import Pokemons.Type;
import Skill.*;

public class Belch extends Skill{
    private static final String name = "Belch";
    private static final Type type = new Type("Poison");
    private static final String ID = "none";
    private static final int baseDamage = 120;
    private static final String description = "Belch deals damage, but only works if the user has previously consumed a Berry during the battle.\n" +
            "Manually feeding a Berry from the bag does not count.";

    public Belch() {
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

public class Belch extends Skill{
    private static final String name = "Belch";
    private static final Type type = new Type("Poison");
    private static final String ID = "none";
    private static final int baseDamage = 120;
    private static final String description = "Belch deals damage, but only works if the user has previously consumed a Berry during the battle.\n" +
            "Manually feeding a Berry from the bag does not count.";

    public Belch() {
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
