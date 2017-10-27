package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class Thunder extends Skill {
    private static final String name = "Thunder";
    private static final Type type = new Type("Electric");
    private static final String ID = "TM25";
    private static final int baseDamage = 110;
    private static final String description = "Thunder deals damage and has a 30% chance of paralyzing the target.\n" +
            "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.\n" +
            "If used during rain, its accuracy rises to 100%. Conversely, if used during intense sunlight, its accuracy drops to 50%.\n" +
            "Thunder can hit Pokemon using Fly and Bounce, the latter dealing double damage.";

    public Thunder() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description);
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
