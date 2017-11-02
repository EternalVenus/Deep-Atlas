package Pokemon.Skill.C;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class CrossPoison extends Skill{
    private  String name;
    private  Type type;
    private  String ID ;
    private   int baseDamage;
    private   String description ;
    private String category;
    private int PP;

    public CrossPoison() {
        super();
        this.name  = "Cross Poison";
        this.type  = new Type("Poison");
        this.ID = "none";
        this.baseDamage   = 70;
        this.description  = "Cross Poison deals damage and has a 10% chance of poisoning the target.\n" +
                "It also has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n" +
                "Poison or Steel type Pokémon, those with the ability Immunity or those behind a Substitute cannot be poisoned.\n";
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
