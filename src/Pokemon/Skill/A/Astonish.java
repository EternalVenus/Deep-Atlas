package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Astonish extends Skill{
    private   String name ;
    private   Type type;
    private   String ID;
    private   int baseDamage ;
    private   String description ;
    private int PP;


    public Astonish() {
        this.name = "Astonish";
        this.type  = new Type("Ghost");
        this.ID  = "none";
        this.baseDamage = 30;
        this.description = "Astonish deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).\n" +
                "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.";
        this.PP = 15;
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
