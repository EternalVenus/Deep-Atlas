package Pokemon;

public class Nature {
    private String[] allTypes = {"Normal", "Fire", "Fighting", "Water", "Flying", "Grass", "Poison", "Electric",
            "Ground", "Psychic", "Rock", "Ice", "Bug", "Dragon", "Ghost", "Dark", "Steel",
            "Fairy"};
    private String nature;

    public Nature(String nature){
        for (String x : allTypes) {
            if (x.equals(nature)) {
                this.nature = nature;
            }
        }
    }

    public String getType() {
        return this.nature;
    }
}
