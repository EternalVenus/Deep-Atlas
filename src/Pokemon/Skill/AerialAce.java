package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class AerialAce extends Skill{
    private static final String name = "Aerial Ace";
    private static final Type type = new Type("Flying");
    private static final String ID = "TM40";
    private static final int baseDamage = 60;
    private static final String description = "Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats.\n"+
                            "However, it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly, Shadow Force or Sky Drop.";

    public AerialAce() {
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
