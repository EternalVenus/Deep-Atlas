package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Astonish extends Skill{
    private static final String name = "Astonish";
    private static final Type type = new Type("Ghost");
    private static final String ID = "none";
    private static final int baseDamage = 30;
    private static final String description = "Astonish deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).\n" +
            "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.";


    private int PP;
    public Astonish() {
        super();
        this.PP = 15;
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
