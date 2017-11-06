package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DarkPulse extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage;
    private   String description ;
    private String category;
    private int PP;

    public DarkPulse() {
        super();
        this.name = "Dark Pulse";
        this.type  = new Type("Dark");
        this.ID = "TM79";
        this.baseDamage = 80;
        this.description = "Dark Pulse deals damage and has a 20% chance of causing the target to flinch (if the target has not yet moved).\n" +
                "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.\n";
        this.PP = 15;
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
}
