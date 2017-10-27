package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class DoomDesire extends Skill{
    private static final String name = "Doom Desire";
    private static final Type type = new Type("Steel");
    private static final String ID = "none";
    private static final int baseDamage = 140;
    private static final String description = "Two turns after the move is selected, Doom Desire will deal damage. \n" +
            "If the opponent switched Pokémon in the meantime, the damage dealt will depend on the Special Defense of the Pokémon the move hits, not the Pokémon it was originally targeted at.";

    public DoomDesire() {
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
