package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AncientPower  extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage ;
    private   String description ;

    private int PP;


    public AncientPower() {
        this.name = "Ancient Power";
        this.type = new Type("Rock");
        this.ID = "none";
        this.baseDamage = 60;
        this.description = "Ancient Power deals damage and has a 10% chance of raising all the user's stats at once - Attack, Defense, Special Attack, Special Defense and Speed - by one stage each.\n" +
                "Stats can be raised to a maximum of +6 stages each.";
        this.PP = 5;
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
