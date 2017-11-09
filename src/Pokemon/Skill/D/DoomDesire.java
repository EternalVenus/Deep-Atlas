package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DoomDesire extends Skill{
    private  String name ;
    private Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public DoomDesire() {
        super();
        this.name = "Doom Desire";
        this.type  = new Type("Steel");
        this.ID = "none";
        this.baseDamage = 140;
        this.description = "Two turns after the move is selected, Doom Desire will deal damage. \n" +
                "If the opponent switched Pokémon in the meantime, the damage dealt will depend on the \n" +
                "Special Defense of the Pokémon the move hits, not the Pokémon it was originally targeted at.\n";
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
