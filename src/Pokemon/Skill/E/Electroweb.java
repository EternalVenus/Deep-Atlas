package Pokemon.Skill.E;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Electroweb extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public Electroweb() {
        super();
        this.name = "Electroweb";
        this.type  = new Type("Electric");
        this.ID = "none";
        this.baseDamage = 55;
        this.description = "Electroweb deals damage and lowers the target's Speed by one stage.\n" +
                "Stats can be lowered to a minimum of -6 stages each.\n";
        this.PP = 15;
        this.category = "Special";
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

    public String getCategory() {
        return category;
    }
}
