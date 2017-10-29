package Skill.C;

import Pokemons.Type;
import Skill.*;

public class Clamp  extends Skill {
    private static final String name = "Clamp";
    private static final Type type = new Type("Water");
    private static final String ID = "none";
    private static final int baseDamage = 35;
    private static final String description = "Clamp inflicts damage on the first turn then traps the opponent, causing them to lose 1⁄16 of their maximum HP after each turn, for 4-5 turns.\n" +
            "If the user holds a Grip Claw then it is always 5 turns.";

    public Clamp() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 10);
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
