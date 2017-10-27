package Skill;

import Skill.Pokemons.Type;

public class AquaJet extends Skill{
    private static final String name = "Aqua Jet";
    private static final Type type = new Type("Water");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Aqua Jet deals damage and has a priority of +1.\n" +
            "Moves with a higher priority always go first, regardless of a Pokémon's speed. If two moves with the same priority are used, the faster Pokémon goes first as usual.";

    public AquaJet() {
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
