package Skill;

import Skill.Pokemons.Type;

public class FlareBlitz extends Skill{
    private static final String name = "Flare Blitz";
    private static final Type type = new Type("Physical");
    private static final String ID = "none";
    private static final int baseDamage = 120;
    private static final String description = "Flare Blitz deals damage and has a 10% chance of burning the target, but the user receives 1⁄3 of the damage it inflicted in recoil. In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.\n" +
            "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.\n" +
            "If the user is frozen, Flare Blitz can be used and will thaw out the Pokemon before attacking.";

    public FlareBlitz() {
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
