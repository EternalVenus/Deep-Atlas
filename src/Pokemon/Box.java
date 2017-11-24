package Pokemon;

import Pokemon.Pokemons.Pokemon;

import java.util.LinkedList;

public class Box {
    private LinkedList<Pokemon> boxList = new LinkedList<>();


    public void addToBox(Pokemon pokemon){
        this.boxList.add(pokemon);
    }

    public void showPokemon(){
        for (int i = 0; i < boxList.size();i++){
            System.out.println(i + ": " + boxList.get(i).getName() + " - Lv " + boxList.get(i).getLevel());
        }
    }

    public boolean find(Pokemon pokemon){
        for (int i = 0; i < boxList.size();i++){
            if (boxList.get(i).getName() == pokemon.getName()) {
                return true;
            }
        }

        return false;
    }

    public boolean remove(Pokemon pokemon){
        for (int i = 0; i < boxList.size();i++){
            if (boxList.get(i).getName() == pokemon.getName()) {
                boxList.remove(pokemon);
                System.out.println(pokemon.getName() + " has been removed from the box");
                return true;
            }
        }

        return false;
    }
}
