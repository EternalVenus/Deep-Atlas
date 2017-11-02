package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BugBite extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID;
    private   int baseDamage;
    private   String description;
    private int PP;
    private String category;

    public BugBite() {
        this.name = "Bug Bite";
        this.type = new Type("Bug");
        this.ID  = "none";
        this.baseDamage  = 60;
        this.description  = "Bug Bite deals damage, and if the target is holding a Berry, the user eats it and gains its effect.\n" +
                "For example, if the target is holding a Sitrus Berry the user will recover 1⁄4 of the its HP.\n" +
                "Bug Bite cannot steal a berry from a Substitute. \n";
        this.PP = 20;
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
