package Pokemon;

public class Nature {
    private String[] allTypes = {"Adamant", "Bashful", "Bold", "Brave", "Calm", "Careful", "Docile", "Gentle",
                                "Hardy", "Hasty", "Impish", "Jolly", "Lax", "Lonely", "Mild", "Modest", "Naive",
                                "Naughty","Quiet", "Quirky", "Rash", "Relaxed", "Sassy", "Serious", "Timid"};
    private String nature;

    public Nature(String nature){
        for (String x : allTypes) {
            if (x.equals(nature)) {
                this.nature = nature;
            }
        }
    }

    public String getNature() {
        return this.nature;
    }
}
