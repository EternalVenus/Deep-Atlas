package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AuraSphere extends Skill{
    private static final String name = "Aura Sphere";
    private static final Type type = new Type("Fighting");
    private static final String ID = "none";
    private static final int baseDamage = 80;
    private static final String description = "Aura Sphere deals damage and ignores changes to the Accuracy and Evasion stats.\n" +
            "However, it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly, Shadow Force or Sky Drop.";

    public AuraSphere() {
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
