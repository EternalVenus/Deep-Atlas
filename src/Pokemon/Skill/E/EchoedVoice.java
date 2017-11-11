package Pokemon.Skill.E;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class EchoedVoice extends Skill {
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public EchoedVoice() {
        super();
        this.name = "Echoed Voice";
        this.type  = new Type("Normal");
        this.ID = "TM49";
        this.baseDamage = 40;
        this.description = "Echoed Voice deals damage starting at base power 40, and increases by 40 \n" +
                "each turn if used by any Pokémon on the field, up to a maximum base power of 200.\n" +
                "It does not reset if it misses, as long as the move is attempted each turn.\n " +
                "The power does not increase during a turn (if multiple Pokémon use it), only after each turn.\n";
        this.PP = 15;
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

    @Override
    public int getPP() {
        return this.PP;
    }

    public String getCategory() {
        return category;
    }
}
