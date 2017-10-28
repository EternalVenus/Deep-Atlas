package Skill.C;

import Pokemons.Type;
import Skill.*;

public class Covet extends Skill{
    private static final String name = "Covet";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 60;
    private static final String description = "Covet deals damage and steals the target's held item, if the user is not already holding an item.\n" +
            "Items stolen from wild Pokémon are kept after the battle ends, but items stolen from a Trainer's Pokémon are not.\n" +
            "Items stolen from the player's Pokémon, either by wild Pokémon or Trainer Pokémon, are returned at the end of the battle.\n" +
            "All held items in wi-fi/linked battles (including Battle Tower/Subway/Maison) are returned to their respective owners at the end of a battle.";

    public Covet() {
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
