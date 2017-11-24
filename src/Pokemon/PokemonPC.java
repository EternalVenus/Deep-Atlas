package Pokemon;

import Pokemon.Pokemons.Pokemon;

import java.util.ArrayList;

public class PokemonPC {
    private ArrayList<Box> box = new ArrayList<>();
    private static final int MAX_BOX = 30;
    private PokemonBag bag;


    public PokemonPC(){
        for (int i = 0; i < MAX_BOX; i++){
            Box boxes = new Box();
            box.add(boxes);
        }
    }


    public boolean storePokemon(Pokemon pokemon, int boxNum){
        if (boxNum > MAX_BOX){
            System.out.println("There is only " + MAX_BOX + " box in the PC.");
            return false;
        }else if(boxNum < 0){
            System.out.println("The number on the box is 0 - 30");
            return false;
        }else{
            this.box.get(boxNum).addToBox(pokemon);
            System.out.println(pokemon.getName() + " has successfully added to box " + boxNum);
            return true;
        }
    }

    public PokemonBag retrievePokemon(Pokemon pokemon, int boxNum, PokemonBag bag){
        this.bag = bag;
        if (foundPokemon(pokemon, boxNum)){
            if (this.bag.bagSize() < 6){
                bag.addToBag(pokemon);
                this.box.get(boxNum).remove(pokemon);
                System.out.println(pokemon.getName() + " has successfully added to bag.");
                return this.bag;
            }else{
                System.out.println("Bag is full. Can not store " + pokemon.getName() + " into the bag.");
                return this.bag;
            }
        }else{
            System.out.println(pokemon.getName() + " is not found in this box.");
            return this.bag;
        }
    }

    public boolean releasePokemon(Pokemon pokemon, int boxNum){
        if (foundPokemon(pokemon, boxNum)){
            this.box.get(boxNum).remove(pokemon);
            System.out.println(pokemon.getName() + " has been released");
            System.out.println("Bye bye " + pokemon.getName());
            return true;
        }else{
            System.out.println(pokemon.getName() + " not found.");
            return false;
        }
    }

    public void showPokemon(int boxNum){
        System.out.println("--------------------------------------");
        System.out.println("Listing IPokemon in box " + boxNum);
        if (boxNum >= 0 && boxNum < 31){
            this.box.get(boxNum).showPokemon();
        }else{
            System.out.println("There is no such box in the PC.");
        }
        System.out.println("--------------------------------------");
    }

    private boolean foundPokemon(Pokemon pokemon, int boxNum){
        return box.get(boxNum).find(pokemon);
    }
}
