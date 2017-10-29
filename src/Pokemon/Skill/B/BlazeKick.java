package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BlazeKick extends Skill{
    private static final String name = "Blaze Kick";
    private static final Type type = new Type("Fire");
    private static final String ID = "none";
    private static final int baseDamage = 85;
    private static final String description = "Blaze Kick deals damage and has a 10% chance of burning the target. It also has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n" +
            "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.\n" +
            "Pokémon with the abilities Battle Armor or Shell Armor are protected against critical hits.";

    public BlazeKick() {
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
