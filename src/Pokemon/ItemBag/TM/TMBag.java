package Pokemon.ItemBag.TM;

import java.util.ArrayList;

public class TMBag {
    private ArrayList<TM> tmList;

    public TMBag(){
        this.tmList = new ArrayList<>();
    }

    public boolean addTM(TM tm){
        if (tmList.indexOf(tm) >= 0){
            return false;
        }else{
            tmList.add(tm);
            return true;
        }
    }

    public void listItems(){
        if (tmList.size() != 0){
            System.out.println("తతతతతతతతతతతతతతతతత TM/HM తతతతతతతతతతతతతతతతతతత");
            for (int i = 0 ; i < tmList.size(); i++){
                System.out.println("\t\t\t\t\t  " + i + ") " + tmList.get(i).getID() + " : " + tmList.get(i).getName());
            }
            System.out.println("తతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతతత");
        }
    }

    public ArrayList<TM> getTmList() {
        return tmList;
    }
}
