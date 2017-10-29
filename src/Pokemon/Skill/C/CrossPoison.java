package Skill.C;

import Pokemons.Type;
import Skill.*;

public class CrossPoison extends Skill{
    private static final String name = "Cross Poison";
    private static final Type type = new Type("Poison");
    private static final String ID = "none";
    private static final int baseDamage = 70;
    private static final String description = "Cross Poison deals damage and has a 10% chance of poisoning the target.\n" +
            "It also has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n" +
            "Poison or Steel type Pokémon, those with the ability Immunity or those behind a Substitute cannot be poisoned.";

    public CrossPoison() {
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
