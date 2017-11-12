package Pokemon.Skill.F;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Facade  extends Skill {
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public Facade() {
        super();
        this.name = "Facade";
        this.type  = new Type("Normal");
        this.ID = "TM42";
        this.baseDamage = 70;
        this.description= "Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.\n" +
                "In the case of a burn, the usual attack-halving still occurs so Facade hits with an effective power of 70.\n";
        this.PP = 20;
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

