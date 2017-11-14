package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Bind  extends Skill{

    public Bind() {
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
        this.name = "Bind";
        this.type  = new Type("Normal");
        this.ID = "none";
        this.baseDamage = 15;
        this.description = "Bind inflicts damage on the first turn then traps the opponent, causing them to lose 1⁄16 of their maximum HP after each turn, for 4-5 turns.\n" +
                "If the user holds a Grip Claw then it is always 5 turns.";
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
