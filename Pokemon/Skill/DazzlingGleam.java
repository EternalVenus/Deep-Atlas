package Skill;

import Skill.Pokemons.Type;

public class DazzlingGleam extends Skill{
    private static final String name = "Dazzling Gleam ";
    private static final Type type = new Type("Fairy");
    private static final String ID = "TM99";
    private static final int baseDamage = 80;
    private static final String description = "Dazzling Gleam deals damage and hits all adjacent opponents in double/triple battles.\n";

    public DazzlingGleam() {
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
