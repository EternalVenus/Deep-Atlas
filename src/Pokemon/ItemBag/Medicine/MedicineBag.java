package Pokemon.ItemBag.Medicine;

import Pokemon.ItemBag.Mail.Mail;
import Pokemon.Pokemons.Pokemon;

import java.util.ArrayList;

public class MedicineBag {
    private ArrayList<Medicine> medicineList;

    public MedicineBag(){
        this.medicineList = new ArrayList<>();
    }

    public int addMedicine(Medicine medicine, int amount){
        if (this.medicineList.indexOf(medicine) >= 0){
            return medicine.addMedicine(amount);
        }else{
            this.medicineList.add(medicine);
            return medicine.addMedicine(amount);
        }
    }

    // If the medicine is found, the method uses the medicine and subtract the amount.
    public boolean useMedicine(int indexOfMedicine, Pokemon pokemon){
        // if the Medicine is found.
        if (indexOfMedicine < 0 || indexOfMedicine >= medicineList.size()){
            return false;
        }else{
            if (medicineList.get(indexOfMedicine).useMedicine(pokemon)){
                medicineList.get(indexOfMedicine).setAmount(-1);
                return true;
            }else{
                return false;
            }
        }
    }

    public void listItems(){
        if (medicineList.size() != 0){
            System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀ Medicines ❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
            for (int i = 0 ; i < medicineList.size(); i++){
                System.out.println("\t\t\t\t\t  " + i + ") " + medicineList.get(i).getName() + " :" + medicineList.get(i).getAmount());
            }
            System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
        }
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }
}
