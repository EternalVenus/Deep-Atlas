package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BoltStrike extends Skill{
    private static final String name = "Bolt Strike";
    private static final Type type = new Type("Electric");
    private static final String ID = "none";
    private static final int baseDamage = 130;
    private static final String description = "Bolt Strike deals damage and has a 20% chance of paralyzing the target.\n" +
            "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.";

    public BoltStrike() {
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
