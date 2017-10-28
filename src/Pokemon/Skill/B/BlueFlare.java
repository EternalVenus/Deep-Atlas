package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BlueFlare extends Skill{
    private static final String name = "Blue Flare";
    private static final Type type = new Type("Fire");
    private static final String ID = "none";
    private static final int baseDamage = 130;
    private static final String description = "Blue Flare deals damage and has a 20% chance of burning the target.\n" +
            "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.";

    public BlueFlare() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 5);
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
