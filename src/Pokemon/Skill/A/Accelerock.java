package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Accelerock extends Skill{
    private static final String name = "Accelerock";
    private static final Type type = new Type("Rock");
    private static final String ID = "none";
    private static final int baseDamage = 40;
    private static final String description = "Accelerock deals damage and has high priority.\n" +
            "Moves with a higher priority always go first, regardless of a Pokémon's speed. If two moves with the same priority are used, the faster Pokémon goes first as usual.";

    private int PP;

    public Accelerock() {
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
