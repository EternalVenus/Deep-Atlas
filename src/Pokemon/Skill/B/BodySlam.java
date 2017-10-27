<<<<<<< HEAD
package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BodySlam extends Skill{
    private static final String name = "Body Slam";
    private static final Type type = new Type("Normal");
    private static final String ID = "TM08";
    private static final int baseDamage = 85;
    private static final String description = "Body Slam deals damage and has a 30% chance of paralyzing the target.\n" +
            "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.";

    public BodySlam() {
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

public class BodySlam extends Skill{
    private static final String name = "Body Slam";
    private static final Type type = new Type("Normal");
    private static final String ID = "TM08";
    private static final int baseDamage = 85;
    private static final String description = "Body Slam deals damage and has a 30% chance of paralyzing the target.\n" +
            "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.";

    public BodySlam() {
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
