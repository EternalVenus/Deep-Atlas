package Pokemon;

public class PokemonPlayer {
    private String name;
    private String gender;
    private PokemonBag pokemonBag;
    private int money;
    private Pokemon pokemonActive;


    public PokemonPlayer(String name, String gender, PokemonBag pokemonBag) {
        this.name = name;
        this.gender = gender;
        this.pokemonBag = pokemonBag;
        this.money = 0;
        this.pokemonActive = pokemonBag.getPokemon().get(0);

    }

    // switches to a pokemon in the bag using its index value
    public boolean switchPokemon(int num){
        if (num < 0 || num > 5){
            System.out.println("There are only 6 pokemon. Pick a number from 0 - 5 ");
            return false;
        }else{
            return true;
        }
    }

    public PokemonBag getPokemonBag() {
        return pokemonBag;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public PokemonBag getBag() {
        return this.pokemonBag;
    }

//    public void printInstruction(){
//        System.out.println("What is your next move?");
//        System.out.println("1 : Attack \n" +
//                            "2 : Switch Pokemons.Pokemons.IPokemon \n" +
//                            "3 : Use item \n" +
//                            "4 : Run");
//
//    }
}
