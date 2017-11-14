package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Bounce extends Skill{

    public Bounce() {
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
                
        this.name = "Bounce";
        this.type = new Type("Flying");
        this.ID = "none";
        this.baseDamage = 85;
        this.description = "The user of Bounce will spring up on the first turn, disappearing from view and becoming invulnerable to most attacks.\n" +
                "On the second turn, Bounce deals damage and has a 30% chance of paralyzing the target.\n" +
                "While in the air, the Pokemon can only be hit by the moves Gust, Twister, Thunder, Sky Uppercut and Smack Down, with Gust and Twister dealing twice normal damage.\n"+
                "Moves from No Guard Pokemon, or any move following an identify move can also hit for regular power.\n" +
                "Electric type Pokémon, those with the ability Limber or those behind a Substitute cannot be paralyzed.\n"+
                "If the user is holding a Power Herb, Bounce executes in one turn.";
        this.PP = 5;
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
