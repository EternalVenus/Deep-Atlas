package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DragonAscent extends Skill {
    private static final String name = "Dragon Ascent";
    private static final Type type = new Type("Dragon");
    private static final String ID = "none";
    private static final int baseDamage = 120;
    private static final String description = "Dragon Ascent deals damage but lowers the user's Defense and Special Defense by one stage each after attacking.\n" +
            "It is the signature move of Rayquaza, and once learned allows Rayquaza to Mega-Evolve.";

    public DragonAscent() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 5);
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
