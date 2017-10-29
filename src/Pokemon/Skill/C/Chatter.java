package Skill.C;

import Pokemons.Type;
import Skill.*;

public class Chatter extends Skill {
    private static final String name = "Chatter";
    private static final Type type = new Type("Flying");
    private static final String ID = "none";
    private static final int baseDamage = 65;
    private static final String description = "Chatter deals damage and causes the target to become confused.\n" +
            "Confused Pokémon have a 50% chance of hurting themselves each turn, for 1-4 turns.\n"
            +  "The damage received is as if the Pokémon attacks itself with a typeless 40 base power Physical attack.\n" +
            "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.";

    public Chatter() {
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
