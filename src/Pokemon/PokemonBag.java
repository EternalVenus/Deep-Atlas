package Pokemon;
import Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemonBag {
    private Scanner scanner = new Scanner(System.in);

    ArrayList<Pokemon> pokemon;
    final static int MAX_SLOTS = 6;
    PokemonPC pc;

    public PokemonBag(PokemonPC pc) {
        this.pc = pc;
        this.pokemon = new ArrayList<>();
    }

    public boolean addToBag(Pokemon pokemon){
        if (this.pokemon.size() == MAX_SLOTS){
            System.out.println("Bag too full. Please select a PC box to sent to.");
            int boxNum = scanner.nextInt();
            scanner.nextLine();
            this.pc.storePokemon(pokemon, boxNum);
            return true;
        } else if (this.pokemon.size() < MAX_SLOTS){
            this.pokemon.add(pokemon);
            System.out.println(pokemon.getName() + " is added to the bag. There is a total of " + this.pokemon.size() + " pokemon in the bag.");
            return true;
        }else{
            // SHOULD NOT GET HERE
            System.out.println("The bag is full. Only 6 pokemon is allowed in the bag.");
            return false;
        }
    }

    public boolean removePokemon(Pokemon pokemon, PokemonPC pc, int boxNum){
        if (this.pokemon.contains(pokemon)){
            if (this.pokemon.size() == 1){
                System.out.println("Only one Pokemon in the bag. Can not remove this pokemon from the bag. ");
                return false;
            }else{
                this.pc.storePokemon(pokemon, boxNum);
                this.pokemon.remove(pokemon);
                System.out.println(pokemon.getName() + " has been removed from the bag.");
                return true;
            }
        }else{
            System.out.println("There is no such pokemon the bag.");
            return false;
        }
    }

    public void listPokemons(){
        System.out.println("---------------------------------------");
        System.out.println("Listing Pokemons in the Bag.");
        for (int i = 0; i < pokemon.size(); i++){
            System.out.println(i + ": " + pokemon.get(i).getName());
        }
        System.out.println("---------------------------------------");
    }

}
