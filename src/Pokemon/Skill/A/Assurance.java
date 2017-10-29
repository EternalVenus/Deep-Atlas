package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Assurance extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage ;
    private   String description;

    private int PP;

    public Assurance() {
        this.name = "Assurance";
        this.type = new Type("Dark");
        this.ID = "TM62";
        this.baseDamage = 60;
        this.description  = "Assurance deals damage, and if the target has already taken damage in this turn its power doubles to 120.";
        this.PP = 10;
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

    @Override
    public int getPP() {
        return this.PP;
    }
}
