package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class Acrobatics  extends Skill{
    private static final String name = "Acrobatics";
    private static final Type type = new Type("Fighting");
    private static final String ID = "TM62";
    private static final int baseDamage = 55;
    private static final String description = "Acrobatics deals damage, however, if the user is not holding an item, its power doubles to 110.\n" +
            "If the user is holding a Flying Gem, it is consumed before the Pokemon attacks, so it receives both boosts and increases Acrobatics' power to 165.\n" +
            "Once the Gem is consumed Acrobatics' power for the rest of the battle will be 110.";

    public Acrobatics() {
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
