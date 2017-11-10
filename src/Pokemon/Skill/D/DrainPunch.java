package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DrainPunch extends Skill {
    private  String name ;
    private Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public DrainPunch() {
        super();
        this.name = "Drain Punch";
        this.type  = new Type("Fighting");
        this.ID = "TM60";
        this.baseDamage = 50;
        this.description  = "Drain Punch deals damage and the user will recover 50% of the HP drained.\n" +
                "If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal).\n" +
                "If used on a Pokemon with the ability Liquid Ooze, the user instead loses the HP it would have otherwise gained.\n";
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
