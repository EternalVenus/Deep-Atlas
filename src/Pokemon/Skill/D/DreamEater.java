package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DreamEater extends Skill{
    private  String name ;
    private Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public DreamEater() {
        super();
        this.name = "Dream Eater";
        this.type  = new Type("Psychic");
        this.ID = "TM42";
        this.baseDamage = 100;
        this.description = "Dream Eater deals damage only on sleeping foes and the user will recover 50% of the HP drained.\n" +
                "If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal). \n"+
                "If used on a Pokemon with the ability Liquid Ooze, the user instead loses the HP it would have otherwise gained.";
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
