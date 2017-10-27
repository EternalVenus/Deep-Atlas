package Skill;

import Skill.Pokemons.Type;

public class FusionBolt extends Skill {
    private static final String name = "Fusion Bolt";
    private static final Type type = new Type("Electric");
    private static final String ID = "none";
    private static final int baseDamage = 100;
    private static final String description = "Fusion Bolt deals damage, and its power doubles to 200 if Fusion Flare has been used before it in the same turn. \n"+
                                            "If this happens Fusion Bolt's animation will change to look more epic.";

    public FusionBolt() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description);
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
