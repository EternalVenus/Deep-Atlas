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

    // If the Poke Ball is found, the method uses the Mail and subtract the amount.
    public int usePokeBall(PokeBall mail){
        // if the PokeBall is found.
        if (this.pokeBallList.indexOf(mail) >= 0){
            return mail.usePokeBall();
        }else{
            System.out.println("There is no such Poke Ball in the bag");
            return 0;
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
