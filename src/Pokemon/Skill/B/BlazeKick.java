package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BlazeKick extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage ;
    private   String description ;
    private int PP;
    private String category;

    public BlazeKick() {
        this.name = "Blaze Kick";
        this.type = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 85;
        this.description = "Blaze Kick deals damage and has a 10% chance of burning the target. It also has an increased critical hit ratio (1⁄8 instead of 1⁄16).\n" +
                "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.\n" +
                "Pokémon with the abilities Battle Armor or Shell Armor are protected against critical hits.";
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
