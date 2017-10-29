package Skill.D;

import Pokemons.Type;
import Skill.*;

public class Dive extends Skill{
    private static final String name = "Dive";
    private static final Type type = new Type("Water");
    private static final String ID = "none";
    private static final int baseDamage = 80;
    private static final String description = "The user of Dive will hide underwater on the first turn, disappearing from view and becoming invulnerable to most attacks. On the second turn, Dive deals damage.\n" +
            "While underwater, the Pokemon can only be hit by the moves Surf, Whirlpool or Low Kick, with Surf and Whirlpool dealing twice normal damage.\n" +
            "Moves from No Guard Pokemon, or any move following an identify move can also hit for regular power.\n" +
            "The user also avoids end-of-turn damage from Sandstorm and Hail when underwater.";

    public Dive() {
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
