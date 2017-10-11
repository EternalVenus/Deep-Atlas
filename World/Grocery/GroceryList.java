import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your shopping list");
        for (int i =0 ; i < groceryList.size(); i++){
            System.out.printf((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String newItem){
        int position = findItem(newItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public int findItem(String searchItem){
            return groceryList.indexOf(searchItem);
    }


}