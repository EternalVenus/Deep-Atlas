package Pokemon.Skill.E;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Eruption extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public Eruption() {
        super();
        this.name = "Eruption";
        this.type  = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 150;
        this.description= "Eruption inflicts more damage when the user's HP is higher.\n" +
                "At full HP its base power is 150 and it decreases in proportion - i.e. the power is:\n" +
                "150 × CurrentHP ÷ MaxHP\n" +
                "Eruption is a counterpart move to Water Spout. It is also similar to Crush Grip \n" +
                "and Wring Out, based on the user rather than the opponent.\n";
        this.PP = 5;
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
