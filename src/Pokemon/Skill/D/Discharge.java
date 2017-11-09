package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Discharge extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;


    public Discharge() {
        super();
        this.name = "Discharge";
        this.type  = new Type("Electric");
        this.ID = "none";
        this.baseDamage = 80;
        this.description = "Discharge deals damage and has a 30% chance of paralyzing the target(s).\n" +
                "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.\n";
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
