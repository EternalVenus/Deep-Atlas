package Skill.A;

import Pokemons.Type;
import Skill.*;


public class AerialAce extends Skill{
    private static final String name = "Aerial Ace";
    private static final Type type = new Type("Flying");
    private static final String ID = "TM40";
    private static final int baseDamage = 60;
    private static final String description = "Aerial Ace deals damage and ignores changes to the Accuracy and Evasion stats.\n"+
                            "However, it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly, Shadow Force or Sky Drop.";

    private int PP;

    public AerialAce() {
        super();
        this.PP = 20;
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

    public String getName() {
        return name;
    }


    public Type getType() {
        return type;
    }


    public int getBaseDamage() {
        return baseDamage;
    }


    public String getDescription() {
        return description;
    }

    public int getPP() {
        return PP;
    }
}
