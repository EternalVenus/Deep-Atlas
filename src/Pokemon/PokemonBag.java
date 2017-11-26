package Pokemon;
import Pokemon.Pokemons.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemonBag {
    private Scanner scanner = new Scanner(System.in);

    //ArrayList with only 6 slots
    private ArrayList<Pokemon> pokemon;
    final static int MAX_SLOTS = 6;
    private PokemonPC pc;

    // constructor
    public PokemonBag(PokemonPC pc) {
        this.pc = pc;
        this.pokemon = new ArrayList<>();
    }

    // Method to add new pokemons into the bag
    // first if statement checks bag is full. If the bag is full. Sent the pokemon to an eligible PC box
    // the else if checks if the bag is not full. Then the pokemon adds straight into the bag
    // Should not get into the last else statement
    public boolean addToBag(Pokemon pokemon){
        if (this.pokemon.size() == MAX_SLOTS){
            System.out.println("ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ Bag too full! Select a PC Box to sent to ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ" );
            int boxNum = scanner.nextInt();
            scanner.nextLine();
            this.pc.storePokemon(pokemon, boxNum);
            return true;
        } else if (this.pokemon.size() < MAX_SLOTS){
            this.pokemon.add(pokemon);
            System.out.println(pokemon.getName() + " is added to the bag. There is a total of " + this.pokemon.size() + " pokemon in the bag. ʕ•̫͡•ིʔྀʕ•̫͡•ིʔྀʕ•̫͡•ིʔྀ");
            return true;
        }else{
            // SHOULD NOT GET HERE
            System.out.println("The bag is full. Only 6 pokemon is allowed in the bag. •̫͡•ʔʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ•̫͡•ʕ•̫͡•ʔ•̫͡•");
            return false;
        }
    }

    // Removes a pokemon from the pokemon bag
    // The pokemon will not be removed if there is only 1 pokemon in the bag
    // Else the pokemon is removed from the pokemon bag and stored into the PC
    // The last else statement returns false because there is no such pokemon in the bag
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

    // List all the pokemons in the bag
    // contains different emoji depending if the pokemon is active or fainted
    public void listPokemons(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("        " + "ฅ^•ﻌ•^ฅ Listing Pokemons in the Bag ฅ^•ﻌ•^ฅ");
        for (int i = 0; i < pokemon.size(); i++){
            if (pokemon.get(i).isFainted()){
                String text = i + ": LV  " + pokemon.get(i).getLevel() + " " + pokemon.get(i).getName() + " ( ✖ ︿ ✖ )";
                System.out.println("             " + text);
            }else{
                String text2 = i + ": LV  " + pokemon.get(i).getLevel() + " " + pokemon.get(i).getName() + " ୧ʕ ◕ o ◕ ʔ୨";
                System.out.println("             " + text2);
            }
        }
        System.out.println("---------------------------------------------------------------");
    }

    // getters
    public int bagSize(){
        return pokemon.size();
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}
