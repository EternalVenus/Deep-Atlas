package Pokemon.Skill;

import Pokemon.Type;
import Pokemon.Pokemon;

public class Skill {
    private String ID;
    private String name;
    private Type type;
    private int baseDamage;
    private String description;
    private int PP;
    private String category;
    private int accuracy;
//
    public Skill(String ID, String name, Type type, int baseDamage, String description, int PP, String category) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.baseDamage = baseDamage;
        this.description = description;
        this.PP = PP;
        this.category = category;
    }

    public Skill(){

    }

    public int effect(Pokemon pokemon){
        return 0;
    }

    public int defenseEffect(Pokemon pokemon){
        return 0;
    }

    public int speedEffect(Pokemon pokemon){
        return 0;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public String getDescription() {
        return description;
    }

    public int getPP() {
        return PP;
    }

    public String getCategory() {
        return category;
    }

    public int getAccuracy() {
        return accuracy;
    }
}
