package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BeakBlast extends Skill{


    public BeakBlast() {
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
 
        this.name = "Beak Blast";
        this.type = new Type("Flying");
        this.ID = "none";
        this.baseDamage  = 100;
        this.description = "The user first heats up its beak, and then it attacks the target.\n"+
                "Making direct contact with the Pokémon while it’s heating up its beak results in a burn.";
        this.PP = 15;
        this.category = "Physical";
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
