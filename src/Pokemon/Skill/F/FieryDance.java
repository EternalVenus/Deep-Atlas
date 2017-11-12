package Pokemon.Skill.F;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class FieryDance extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public FieryDance() {
        super();
        this.name = "Fiery Dance";
        this.type  = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 80;
        this.description= "Fiery Dance deals damage and has a 50% chance of raising the user's Special Attack by one stage.\n" +
                "Stats can be raised to a maximum of +6 stages each.\n";
        this.PP = 10;
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
