package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DizzyPunch extends Skill{
    private static final String name = "Dizzy Punch";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 70;
    private static final String description = "Dizzy Punch deals damage and has a 20% chance of confusing the target.\n" +
            "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.";

    public DizzyPunch() {
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
