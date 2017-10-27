<<<<<<< HEAD
package Pokemons;

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
=======
package Pokemons;

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
>>>>>>> 90693d60b0828c75d3160ae52fc74f69c760d587
