package Pokemon.ItemBag.Medicine;

import Pokemon.ItemBag.Mail.Mail;

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
    public int useMedicine(Medicine medicine){
        // if the berry is found.
        if (this.medicineList.indexOf(medicine) >= 0){
            return medicine.useMedicine();
        }else{
            System.out.println("There is no such Medicine in the bag");
            return 0;
        }
    }

    public void listItems(){
        for (int i = 0 ; i < medicineList.size(); i++){
            System.out.println("----- Medicines -----");
            System.out.println(i + ") " + medicineList.get(i) + " :" + medicineList.get(i).getAmount());
        }
            System.out.println("---------------------");
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }
}
