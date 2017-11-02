package Pokemon.Skill.C;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class ChargeBeam extends Skill {
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage;
    private   String description;
    private int PP;
    private String category;

    public ChargeBeam() {
        super();
        this.name = "Charge Beam";
        this.type  = new Type("Electric");
        this.ID = "TM57";
        this.baseDamage  = 50;
        this.description  = "Charge Beam deals damage and has a 70% chance of raising the user's Special Attack by one stage.\n" +
                "Stats can be raised to a maximum of +6 stages each.\n";
        this.PP = 10;
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
