package Pokemon.Pokemon;

import Skill.Skill;

public class Type {
    private String[] allTypes = {"Normal", "Fire", "Fighting", "Water", "Flying", "Grass", "Poison", "Electric",
                                "Ground", "Psychic", "Rock", "Ice", "Bug", "Dragon", "Ghost", "Dark", "Steel",
                                "Fairy"};
    private String type;

    public Type(String type){
        for (String x : allTypes) {
            if (x == type) {
                this.type = type;
            }
        }
    }

    public String getType() {
        return this.type;
    }
}
