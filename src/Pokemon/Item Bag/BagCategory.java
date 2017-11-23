package Pokemon.ItemBag;

public class BagCategory {

    // to be overriden
    public String getClassName(){
        return "Class Name";
    }

    //to be overriden
    public String getName() {
        return "Name";
    }

    //to be overriden
    public String getDescription() {
        return "Description";
    }

    //to be overriden
    public int getGrowthTime() {
        return 1;
    }

    //to be overriden
    public int getAmount() {
        return 1;
    }

    //to be overriden
    public double getSize() {
        return 1;
    }

    //to be overriden
    public String getLocation() {
        return "Location";
    }

    //to be overriden
    public String getFirmness() {
        return "Firmness";
    }

    //to be overriden
    public int addBerry(int berryAmount){
        return 1;
    }
}
