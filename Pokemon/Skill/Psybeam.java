package Skill;
import Skill.Pokemons.Type;

public class Psybeam extends Skill{

    private static final String name = "Psybeam";
    private static final Type type = new Type("Psybeam");
    private static final String ID = "none";
    private static final int baseDamage = 65;
    private static final String description = "PPsybeam deals damage and has a 10% chance of confusing the target.\n" +
            "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.";

    public Psybeam() {
        super(this.ID, this.name, this.type, this.baseDamage , this.description);
    }

    @Override
    public int effect(Pokemon pokemon) {
        return super.effect(pokemon);
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
