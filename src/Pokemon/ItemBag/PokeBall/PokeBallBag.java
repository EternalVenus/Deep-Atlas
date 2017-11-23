package Pokemon.ItemBag.PokeBall;

import java.util.ArrayList;

public class PokeBallBag {
    private ArrayList<PokeBall> pokeBallList;

    public PokeBallBag(){
        this.pokeBallList = new ArrayList<>();
    }

    public int addPokeBall(PokeBall pokeBall, int amount){
        if (this.pokeBallList.indexOf(pokeBall) >= 0){
            return pokeBall.addPokeBall(amount);
        }else{
            this.pokeBallList.add(pokeBall);
            return pokeBall.addPokeBall(amount);
        }
    }

    // If the Poke Ball is found, the method uses the Pokeball and subtract the amount.
    public boolean usePokeBall(int indexOfPokeBall){
        // if the PokeBall is found.
        if (indexOfPokeBall < 0 || indexOfPokeBall >= pokeBallList.size()){
//            System.out.println("There is no such Poke ball in the bag.");
            return false;
        }else{
            pokeBallList.get(indexOfPokeBall).setAmount(-1);
            return true;
        }
    }

    public void listItems(){
        if (pokeBallList.size() != 0){
            System.out.println("-----Poke Balls-----");

            for (int i = 0 ; i < pokeBallList.size(); i++){
                System.out.println(i + ") " + pokeBallList.get(i).getName() + " :" + pokeBallList.get(i).getAmount());
            }
            System.out.println("---------------------");
        }
    }

    public ArrayList<PokeBall> getPokeBallList() {
        return pokeBallList;
    }
}
