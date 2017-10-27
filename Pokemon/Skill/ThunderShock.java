package Skill;

import Skill.Pokemons.Type;

public class ThunderShock extends Skill {
    private static final String name = "Thunder Shock";
    private static final Type type = new Type("Electric");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Thunder Shock deals damage and has a 10% chance of paralyzing the target.\n" +
            "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.";

    public ThunderShock() {
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

