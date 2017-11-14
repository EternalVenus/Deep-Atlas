package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Blizzard extends Skill{

    public Blizzard() {
        super("Absorb",
                new Type("Grass"),
                "none",
                20,
                "Absorb deals damage and the user will recover 50% of the HP drained.\n" +
                        "If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal). \n" +
                        "If used on a IPokemon with the ability Liquid Ooze,\n" +
                        "the user instead loses the HP it would have otherwise gained.\n",
                25,
                "Special"
                );
                
        this.name = "Blizzard";
        this.type = new Type("Ice");
        this.ID = "TM14";
        this.baseDamage = 110;
        this.description = "Blizzard deals damage and has a 10% chance of freezing the target.\n" +
                "It will hit both opponents in a double battle or adjacent opponents in a triple battle.\n" +
                "Ice type Pokémon, those with the ability Magma Armor or those behind a Substitute cannot be frozen.\n" +
                "During a hailstorm, Blizzard has 100% accuracy.";
        this.PP = 5;
        this.category = "Special";
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

}
