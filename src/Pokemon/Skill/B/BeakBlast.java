package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BeakBlast extends Skill{
    private static final String name = "Beak Blast";
    private static final Type type = new Type("Flying");
    private static final String ID = "none";
    private static final int baseDamage = 100;
    private static final String description = "The user first heats up its beak, and then it attacks the target.\n"+
                        "Making direct contact with the Pokémon while it’s heating up its beak results in a burn.";

    public BeakBlast() {
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
