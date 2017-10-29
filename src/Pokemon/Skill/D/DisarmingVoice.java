package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DisarmingVoice extends Skill{
    private static final String name = "Disarming Voice";
    private static final Type type = new Type("Fairy");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Disarming Voice deals damage and ignores changes to the Accuracy and Evasion stats.\n" +
            "However, it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly, Shadow Force or Sky Drop.";

    public DisarmingVoice() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 15);
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
