package Skill;

import Skill.Pokemons.Type;

public class ExtremeSpeed extends Skill{
    private static final String name = "Extreme Speed";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 80;
    private static final String description = "In Generations 1-4, its priority is +1, which means that an opponent using other priority moves such as Quick Attack or Aqua Jet can attack before Extreme Speed if the opponent is faster.\n" +
            "In Generations 2-5, this move's name was formatted as ExtremeSpeed.";

    public ExtremeSpeed() {
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
