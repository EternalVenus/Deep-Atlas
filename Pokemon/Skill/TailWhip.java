package Skill;

import Skill.Pokemons.Type;

public class TailWhip extends Skill{
    private static final String name = "Tail Whip";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 0;
    private static final String description = "Reduces the Defense stat of the defending Pokémon. In a 2X2 battle, it effects both defending Pokémon.\n" +
                                                "This move is not a contact move.";

    public TailWhip() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description);
    }

    public int defenseEffect(Pokemon pokemon) {
        int defense = pokemon.getDefense();
        defense -= (int)(pokemon.getLevel() / 2);
        return defense;
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
