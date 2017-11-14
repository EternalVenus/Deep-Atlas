package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BugBite extends Skill{

    public BugBite() {
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
                
        this.name = "Bug Bite";
        this.type = new Type("Bug");
        this.ID  = "none";
        this.baseDamage  = 60;
        this.description  = "Bug Bite deals damage, and if the target is holding a Berry, the user eats it and gains its effect.\n" +
                "For example, if the target is holding a Sitrus Berry the user will recover 1⁄4 of the its HP.\n" +
                "Bug Bite cannot steal a berry from a Substitute. \n";
        this.PP = 20;
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
