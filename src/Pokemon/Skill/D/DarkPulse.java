package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DarkPulse extends Skill{
    private static final String name = "Dark Pulse";
    private static final Type type = new Type("Dark");
    private static final String ID = "TM79";
    private static final int baseDamage = 80;
    private static final String description = "Dark Pulse deals damage and has a 20% chance of causing the target to flinch (if the target has not yet moved).\n" +
            "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.";

    public DarkPulse() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 15);
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