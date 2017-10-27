package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class VoltTackle extends Skill{
    private static final String name = "Volt Tackle";
    private static final Type type = new Type("Electric");
    private static final String ID = "none";
    private static final int baseDamage = 120;
    private static final String description = "Volt Tackle deals damage and has a 10% chance of paralyzing the target, but the user receives 1⁄3 of the damage it inflicted in recoil. In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.";

    public VoltTackle() {
        super(this.ID, this.name, this.type, this.baseDamage , this.description);
    }

    @Override
    public int effect(Pokemon pokemon) {
        return super.effect(pokemon);
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
