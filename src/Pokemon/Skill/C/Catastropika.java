package Skill.C;

import Pokemons.Type;
import Skill.*;

public class Catastropika extends Skill {
    private static final String name = "Catastropika";
    private static final Type type = new Type("Electric");
    private static final String ID = "none";
    private static final int baseDamage = 210;
    private static final String description = "Catastropika is a Z-Move exclusive to Pikachu. It can only be used with Volt Tackle.";

    public Catastropika() {
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
