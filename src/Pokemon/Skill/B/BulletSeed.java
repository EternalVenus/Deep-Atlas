package Skill.B;

import Pokemons.Type;
import Skill.*;

public class BulletSeed extends Skill{
    private static final String name = "Bullet Seed";
    private static final Type type = new Type("Grass");
    private static final String ID = "TM09";
    private static final int baseDamage = 25;
    private static final String description = "Bullet Seed hits 2-5 times per turn used.\n" +
            "The probability of each interval is shown to the right, with the total power after each hit.";

    public BulletSeed() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 30);
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
