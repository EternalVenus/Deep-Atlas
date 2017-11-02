package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BulletSeed extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID;
    private   int baseDamage;
    private   String description ;
    private int PP;
    private String category;

    public BulletSeed() {
        this.name = "Bullet Seed";
        this.type = new Type("Grass");
        this.ID  = "TM09";
        this.baseDamage  = 25;
        this.description = "Bullet Seed hits 2-5 times per turn used.\n" +
                "The probability of each interval is shown to the right, with the total power after each hit.";
        this.PP = 30;
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
