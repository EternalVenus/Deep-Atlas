package Pokemon.Skill.C;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class CrushClaw extends Skill{
    private   String name;
    private   Type type;
    private   String ID ;
    private   int baseDamage;
    private   String description ;
    private String category;
    private int PP;

    public CrushClaw() {
        super();
        this.name = "Crush Claw";
        this.type  = new Type("Normal");
        this.ID = "none";
        this.baseDamage = 75;
        this.description = "Crush Claw deals damage and has a 50% chance of lowering the target's Defense by one stage.\n" +
                "Stats can be lowered to a minimum of -6 stages each.\n";
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
