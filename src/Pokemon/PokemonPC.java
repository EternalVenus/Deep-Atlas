package Pokemon;

import Pokemon.Pokemons.Pokemon;

import java.util.ArrayList;

public class PokemonPC {
    private ArrayList<Box> box = new ArrayList<>();
    private static final int MAX_BOX = 30;
    private PokemonBag bag;

    // constructor. Declares the 30 boxes for the PC
    // Stores 30 boxes into the arraylist
    public PokemonPC(){
        for (int i = 0; i < MAX_BOX; i++){
            Box boxes = new Box();
            box.add(boxes);
        }
    }


    // Stores the pokemon into the PC
    //The first "if" statement checks if the user picks a number greater than 29, which exceed the maximum amount in the arraylist
    // The "Else If" checks if the user picks a number smaller than zero
    // The last "else" stores the pokemon into one of the box in the PC
    public boolean storePokemon(Pokemon pokemon, int boxNum){
        if (boxNum > MAX_BOX){
            System.out.println("There are only " + MAX_BOX + " boxes in the PC (Ò 皿 Ó ╬)");
            return false;
        }else if(boxNum < 0){
            System.out.println("Pick a box (0 - 30) (Ò 皿 Ó ╬)");
            return false;
        }else{
            this.box.get(boxNum).addToBox(pokemon);
            System.out.println(pokemon.getName() + " has successfully added to box " + boxNum + " ヾ(@°▽°@)ノ");
            return true;
        }
    }

    // The method passes in following parameter
    // the pokemon to retrieve
    // The boxNumber in the PC
    // The pokemonBag that is to be transferred to
    // First "if" statement checks if the pokemon is actually inside the box number
    // Second "if" statement checks if the pokemonBag size less than 6. Then adds the pokemon to the bag
    // The else statement means the bag does not have space and not store the pokemon
    // The last "else" statement means the pokemon is not inside the boxNumber
    public boolean retrievePokemon(Pokemon pokemon, int boxNum, PokemonBag bag){
        this.bag = bag;
        if (foundPokemon(pokemon, boxNum)){
            if (this.bag.bagSize() < 6){
                bag.addToBag(pokemon);
                this.box.get(boxNum).remove(pokemon);
                System.out.println(pokemon.getName() + " has successfully added to bag. ヾ（*⌒ヮ⌒*）ゞ");
                return true;
            }else{
                System.out.println("Bag is full. Can not store " + pokemon.getName() + " into the bag ヘ(￣ー￣ヘ)");
                return false;
            }
        }else{
            System.out.println(pokemon.getName() + " is not found in this box (☄ฺ◣д◢)☄");
            return false;
        }
    }

    public boolean releasePokemon(Pokemon pokemon, int boxNum){
        if (foundPokemon(pokemon, boxNum)){
            this.box.get(boxNum).remove(pokemon);
            System.out.println(pokemon.getName() + " has been released ʕ ࿃࿆ _ ࿃࿆ ʔ");
            System.out.println("Bye bye " + pokemon.getName() + " ヽ༼၀-၀༽ﾉ");
            return true;
        }else{
            System.out.println(pokemon.getName() + " not found (ꐦ ಠ皿ಠ )");
            return false;
        }
    }

    // This method shows all the pokemon in a particular box in the PC
    // returns true if there is such a box and false if there is no such box
    public boolean showPokemon(int boxNum){
        System.out.println("-------------------------------------------------------------------");
        if (boxNum >= 0 && boxNum < 30){
            System.out.println("ʕ•̫͡•ʕ*̫͡*ʕ•͓͡•ʔ-̫͡-ʕ•̫͡•ʔ*̫͡*ʔ-̫͡-ʔ Listing Pokemon in box " + boxNum + " ʕ•̫͡•ʕ*̫͡*ʕ•͓͡•ʔ-̫͡-ʕ•̫͡•ʔ*̫͡*ʔ-̫͡-ʔ");
            this.box.get(boxNum).showPokemon();
            System.out.println("-------------------------------------------------------------------");
            return true;
        }else{
            System.out.println("There is no such box in the PC (｡☉︵ ಠ╬)");
            System.out.println("-------------------------------------------------------------------");
            return false;
        }
    }

    // checks if the pokemon is actually inside the box
    // returns true if the pokemon is found and false if the pokemon is not found
    private boolean foundPokemon(Pokemon pokemon, int boxNum){
        return box.get(boxNum).find(pokemon);
    }
}
