package Pokemon.ItemBag.KeyItem;

public class KeyItems{
    private String name;
    private String location;
    private String description;
    private String effect;

    public KeyItems(String name, String location, String description, String effect) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.effect = effect;
    }
    public String getClassName(){
        return "Key Item";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }


}
