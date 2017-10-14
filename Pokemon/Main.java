
public class Main {
    public static void main(String[] args){

        Pokemon pikachu = new Pokemon("Pikachu");
        Pokemon charmander = new Pokemon("Charmander");
        Pokemon squirtle = new Pokemon("Squirtle");
        Pokemon piplup = new Pokemon("Piplup");
        Pokemon bulbasaur = new Pokemon("Bulbasaur");
        Pokemon mew = new Pokemon("Mew");
        Pokemon mewtwo = new Pokemon("MewTwo");

        PokemonPC pc = new PokemonPC();
        PokemonBag bag = new PokemonBag(pc);

        bag.addToBag(pikachu);
        bag.addToBag(charmander);
        bag.addToBag(squirtle);
        bag.addToBag(piplup);
        bag.addToBag(bulbasaur);
//        bag.addToBag(mew);
//        bag.addToBag(mewtwo);
//        bag.addToBag(mew);

//        bag.removePokemon(pikachu,pc, 10);
//        bag.removePokemon(squirtle,pc, 10);

//        bag.listPokemons();

        pc.storePokemon(pikachu,10);
        pc.storePokemon(pikachu,10);
        pc.storePokemon(mew,10);
        pc.storePokemon(mewtwo,10);
        pc.showPokemon(10);

        pc.retrievePokemon(pikachu, 10, bag);
        pc.retrievePokemon(pikachu, 10, bag);
        bag.listPokemons();
        pc.showPokemon(10);
    }
}
