package Skill.B;

import Pokemons.Type;
import Skill.*;

public class Boomburst extends Skill{
    private static final String name = "Boomburst";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 140;
    private static final String description = "Boomburst deals massive damage and targets all adjacent Pokémon in battle, including allies.";

    public Boomburst() {
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
