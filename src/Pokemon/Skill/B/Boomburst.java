package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Boomburst extends Skill{

    public Boomburst() {
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
                
        this.name = "Boomburst";
        this.type = new Type("Normal");
        this.ID = "none";
        this.baseDamage  = 140;
        this.description  = "Boomburst deals massive damage and targets all adjacent Pokémon in battle, including allies.";
        this.PP = 10;
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
