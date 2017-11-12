package Pokemon.Skill.F;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class FakeOut extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public FakeOut() {
        super();
        this.name = "Fake Out";
        this.type  = new Type("Normal");
        this.ID = "none";
        this.baseDamage = 40;
        this.description= "Fake Out attacks with a priority of +3 and causes the target to flinch if it hits. It is only successful on the first turn the Pokemon is in battle, but reset each time the Pokemon switches out and back in.\n" +
                "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.\n";
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
