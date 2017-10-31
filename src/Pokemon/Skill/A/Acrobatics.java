package Pokemon.Skill.A;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;


public class Acrobatics  extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage ;
    private   String description ;
    private int PP;
    private String category;

    public Acrobatics() {
        this.name = "Acrobatics";
        this.type = new Type("Fighting");
        this.ID = "TM62";
        this.baseDamage = 55;
        this.description = "Acrobatics deals damage, however, if the user is not holding an item, its power doubles to 110.\n" +
                "If the user is holding a Flying Gem, it is consumed before the IPokemon attacks, so it receives both boosts and increases Acrobatics' power to 165.\n" +
                "Once the Gem is consumed Acrobatics' power for the rest of the battle will be 110.";
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
