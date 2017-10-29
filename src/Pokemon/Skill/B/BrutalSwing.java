package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BrutalSwing extends Skill{
    private static final String name = "Brutal Swing";
    private static final Type type = new Type("Dark");
    private static final String ID = "TM59";
    private static final int baseDamage = 60;
    private static final String description = "The user swings its body around violently to inflict damage on everything in its vicinity.\n";

    public BrutalSwing() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 20);
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
