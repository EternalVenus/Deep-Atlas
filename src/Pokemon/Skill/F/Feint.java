package Pokemon.Skill.F;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Feint extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public Feint() {
        super();
        this.name = "Feint";
        this.type  = new Type("Normal");
        this.ID = "TM54";
        this.baseDamage = 30;
        this.description= "Feint only hits if the target used Protect or Detect in the same turn.\n"+
                "It also cancels Protect/Detect for the remainder of the turn, so subsequent moves in the same turn \n" +
                "(in double/triple battles) can still hit.\n";
        this.PP = 10;
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

    @Override
    public int getPP() {
        return this.PP;
    }

    public String getCategory() {
        return category;
    }
}
