package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DoubleEdge extends Skill{
    private  String name ;
    private Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;


    public DoubleEdge() {
        super();
        this.name = "Double-Edge";
        this.type  = new Type("Normal");
        this.ID = "none";
        this.baseDamage = 120;
        this.description = "Double-Edge deals damage, but the user receives 1⁄3 of the damage it inflicted in recoil.\n"  +
                "In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.\n";
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
