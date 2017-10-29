package Skill.A;

import Pokemons.Type;
import Skill.*;


public class AerialAce extends Skill{
    private   String name ;
    private   Type type;
    private   String ID ;
    private   int baseDamage ;
    private   String description ;
    private   int PP;



    public AerialAce() {
        this.name = "Aerial Ace";
        this.type = new Type("Flying");
        this.ID = "TM40";
        this.baseDamage = 60;
        this.description = "Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats.\n"+
                "However, it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly, Shadow Force or Sky Drop.";
        this.PP = 20;
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
