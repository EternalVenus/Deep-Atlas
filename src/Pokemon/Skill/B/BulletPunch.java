package Pokemon.Skill.B;

import Pokemon.Pokemons.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class BulletPunch extends Skill{

    public BulletPunch() {
        this.name = "Bullet Punch";
        this.type = new Type("Steel");
        this.ID = "none";
        this.baseDamage  = 40;
        this.description = "Bullet Punch deals damage and has a priority of +1.\n" +
                "Moves with a higher priority always go first, regardless of a Pokémon's speed.\n"+
                "If two moves with the same priority are used, the faster Pokémon goes first as usual.\n";
        this.PP = 30;
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
