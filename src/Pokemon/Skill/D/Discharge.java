package Skill.D;

import Pokemons.Type;
import Skill.*;

public class Discharge extends Skill{
    private static final String name = "Discharge";
    private static final Type type = new Type("Electric");
    private static final String ID = "none";
    private static final int baseDamage = 80;
    private static final String description = "Discharge deals damage and has a 30% chance of paralyzing the target(s).\n" +
            "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.";

    public Discharge() {
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