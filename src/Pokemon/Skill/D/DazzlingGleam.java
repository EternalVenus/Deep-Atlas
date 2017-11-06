package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DazzlingGleam extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage;
    private   String description ;
    private String category;
    private int PP;

    public DazzlingGleam() {
        super();
        this.name = "Dazzling Gleam";
        this.type  = new Type("Fairy");
        this.ID = "TM99";
        this.baseDamage = 80;
        this.description = "Dazzling Gleam deals damage and hits all adjacent opponents in double/triple battles.\n";
        this.PP = 80;
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
}
