package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class MillionVoltThunderBolt extends Skill {
    private static final String name = "10,000,000 Volt Thunderbolt";
    private static final Type type = new Type("Electric");
    private static final String ID = "none";
    private static final int baseDamage = 195;
    private static final String description = "10,000,000 Volt Thunderbolt is an Electric type Z-Move exclusive to Ash's Pikachu. It is used with Thunderbolt.\n" +
            "10,000,000 Volt Thunderbolt deals damage and has an increased critical hit ratio (1⁄8 instead of 1⁄16).";

    public MillionVoltThunderBolt() {
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
