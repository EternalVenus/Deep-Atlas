package Pokemon.Pokemons;

import Pokemon.Skill.*;
import Pokemon.Pokemon;

public interface IPokemon {
    Pokemon attack(Pokemon pokemon, Skill skill);

    public Skill getSkill1();

    public Skill getSkill2();

    public Skill getSkill3();

    public Skill getSkill4();
}
