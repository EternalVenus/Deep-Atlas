package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class Accelerock extends Skill{
    private static final String name = "Accelerock";
    private static final Type type = new Type("Rock");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Accelerock deals damage and has high priority.\n" +
            "Moves with a higher priority always go first, regardless of a Pokémon's speed. If two moves with the same priority are used, the faster Pokémon goes first as usual.";

    public Accelerock() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description);
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
