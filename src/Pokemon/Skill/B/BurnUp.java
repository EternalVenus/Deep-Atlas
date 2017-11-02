package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BurnUp extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID;
    private   int baseDamage;
    private   String description;
    private int PP;
    private String category;

    public BurnUp() {
        this.name= "Burn Up";
        this.type = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 130;
        this.description = "To inflict massive damage, the user burns itself out.\n"+
                "After using this move, the user will no longer be Fire type.\n";
        this.PP = 5;
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
