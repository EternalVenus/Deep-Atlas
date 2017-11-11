package Pokemon.Skill.E;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class ExtremeSpeed extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public ExtremeSpeed() {
        super();
        this.name = "Extreme Speed";
        this.type  = new Type("Normal");
        this.ID = "none";
        this.baseDamage = 80;
        this.description = "In Generations 1-4, its priority is +1, which means that an opponent using other priority moves such as Quick Attack or Aqua Jet can attack before Extreme Speed if the opponent is faster.\n" +
                "In Generations 2-5, this move's name was formatted as ExtremeSpeed.\n";
        this.PP = 5;
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
