package Pokemon.Skill.C;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Clamp  extends Skill {
    private   String name ;
    private   Type type ;
    private   String ID;
    private   int baseDamage ;
    private   String description;
    private String category;
    private int PP;

    public Clamp() {
        super();
        this.name = "Clamp";
        this.type  = new Type("Water");
        this.ID = "none";
        this.baseDamage = 35;
        this.description  = "Clamp inflicts damage on the first turn then traps the opponent, causing them to lose 1⁄16 of their maximum HP after each turn, for 4-5 turns.\n" +
                "If the user holds a Grip Claw then it is always 5 turns.\n";
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
