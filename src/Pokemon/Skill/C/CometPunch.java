package Pokemon.Skill.C;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class CometPunch extends Skill{
    private   String name;
    private   Type type ;
    private   String ID ;
    private   int baseDamage ;
    private   String description ;
    private String category;
    private int PP;

    public CometPunch() {
        super();
        this.name  = "Comet Punch";
        this.type = new Type("Normal");
        this.ID = "none";
        this.baseDamage  = 18;
        this.description  = "Comet Punch hits 2-5 times per turn used.\n"+ "" +
                "The probability of each interval is shown to the right, with the total power after each hit.\n";
        this.PP = 15;
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
