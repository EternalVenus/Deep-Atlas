package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AnchorShot extends Skill{
    private static final String name = "Anchor Shot";
    private static final Type type = new Type("Steel");
    private static final String ID = "none";
    private static final int baseDamage = 80;
    private static final String description = "The user entangles the target with its anchor chain while attacking. The target becomes unable to flee.";

    private int PP;

    public AnchorShot() {
        super();
        this.PP = 20;
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

    public String getName() {
        return name;
    }


    public Type getType() {
        return type;
    }


    public int getBaseDamage() {
        return baseDamage;
    }


    public String getDescription() {
        return description;
    }

    public int getPP() {
        return PP;
    }
}
