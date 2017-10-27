package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AnchorShot extends Skill{
    private static final String name = "Anchor Shot";
    private static final Type type = new Type("Steel");
    private static final String ID = "none";
    private static final int baseDamage = 80;
    private static final String description = "The user entangles the target with its anchor chain while attacking. The target becomes unable to flee.";

    public AnchorShot() {
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
