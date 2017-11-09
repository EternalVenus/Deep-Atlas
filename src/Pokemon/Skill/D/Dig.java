package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Dig extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;


    public Dig() {
        super();
        this.name = "Dig";
        this.type  = new Type("Ground");
        this.ID = "none";
        this.baseDamage = 80;
        this.description = "The user of Dig will burrow its way underground on the first turn, disappearing from view and becoming invulnerable to most attacks.\n" +
                "On the second turn, Dig deals damage.\n" +
                "While underground, the Pokemon can only be hit by the moves Earthquake, Magnitude or Fissure, with Earthquake and Magnitude dealing twice normal damage.\n" +
                "Moves from No Guard Pokemon, or any move following an identify move can also hit for regular power.\n " +
                "The user also avoids end-of-turn damage from Sandstorm and Hail when underground.";
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
