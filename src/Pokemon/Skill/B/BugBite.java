package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BugBite extends Skill{
    private static final String name = "Bug Bite";
    private static final Type type = new Type("Bug");
    private static final String ID = "none";
    private static final int baseDamage = 60;
    private static final String description = "Bug Bite deals damage, and if the target is holding a Berry, the user eats it and gains its effect.\n" +
            "For example, if the target is holding a Sitrus Berry the user will recover 1⁄4 of the its HP.\n" +
            "Bug Bite cannot steal a berry from a Substitute.";

    public BugBite() {
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
