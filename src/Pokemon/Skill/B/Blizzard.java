package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Blizzard extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage ;
    private   String description;
    private int PP;
    private String category;

    public Blizzard() {
        this.name = "Blizzard";
        this.type = new Type("Ice");
        this.ID = "TM14";
        this.baseDamage = 110;
        this.description = "Blizzard deals damage and has a 10% chance of freezing the target.\n" +
                "It will hit both opponents in a double battle or adjacent opponents in a triple battle.\n" +
                "Ice type Pokémon, those with the ability Magma Armor or those behind a Substitute cannot be frozen.\n" +
                "During a hailstorm, Blizzard has 100% accuracy.";
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
