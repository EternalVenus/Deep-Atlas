package Skill.A;

import Pokemons.Type;
import Skill.*;


public class AirCutter extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID;
    private   int baseDamage ;
    private   String description ;
    private int PP;


    public AirCutter() {
        this.name = "Air Cutter";
        this.type = new Type("Flying");
        this.ID  = "none";
        this.baseDamage = 60;
        this.description = "Air Cutter deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n";
        this.PP = 25;
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
