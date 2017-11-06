package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DiamondStorm extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage;
    private   String description ;
    private String category;
    private int PP;

    public DiamondStorm() {
        super();
        this.name = "Diamond Storm";
        this.type  = new Type("Rock");
        this.ID = "none";
        this.baseDamage = 100;
        this.description = "Diamond Storm deals damage and has a 50% chance of raising the user's Defense by one stage.\n" +
                "It hits all adjacent opponents in double/triple battles.\n" +
                "Stats can be raised to a maximum of +6 stages each.";
        this.PP = 5;
        this.category = "Physical";
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
