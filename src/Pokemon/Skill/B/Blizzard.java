package Skill.B;

import Pokemons.Type;
import Skill.*;

public class Blizzard extends Skill{
    private static final String name = "Blizzard";
    private static final Type type = new Type("Ice");
    private static final String ID = "TM14";
    private static final int baseDamage = 110;
    private static final String description = "Blizzard deals damage and has a 10% chance of freezing the target.\n" +
            "It will hit both opponents in a double battle or adjacent opponents in a triple battle.\n" +
            "Ice type Pokémon, those with the ability Magma Armor or those behind a Substitute cannot be frozen.\n" +
            "During a hailstorm, Blizzard has 100% accuracy.";

    public Blizzard() {
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
