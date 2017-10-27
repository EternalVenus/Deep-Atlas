package Skill;

import Skill.Pokemons.Type;

public abstract class Skill {
    private String ID;
    private String name;
    private Type type;
    private int baseDamage;
    private String description;

    public Skill(String ID, String name, Type type, int baseDamage, String description) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.baseDamage = baseDamage;
        this.description = description;
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
}
