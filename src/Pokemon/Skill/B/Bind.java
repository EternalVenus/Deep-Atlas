package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Bind  extends Skill{
    private   String name ;
    private   Type type;
    private   String ID ;
    private   int baseDamage ;
    private   String description ;
    private int PP;
    private String category;

    public Bind() {
        this.name = "Bind";
        this.type  = new Type("Normal");
        this.ID = "none";
        this.baseDamage = 15;
        this.description = "Bind inflicts damage on the first turn then traps the opponent, causing them to lose 1⁄16 of their maximum HP after each turn, for 4-5 turns.\n" +
                "If the user holds a Grip Claw then it is always 5 turns.";
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
