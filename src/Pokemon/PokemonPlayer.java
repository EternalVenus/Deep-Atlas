package Pokemon;

public class PokemonPlayer {
    private String name;
    private String gender;
    private PokemonBag bag;
    private int money;

    public PokemonPlayer(String name, String gender, PokemonBag bag, int money) {
        this.name = name;
        this.gender = gender;
        this.bag = bag;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public PokemonBag getBag() {
        return bag;
    }

    public void printInstruction(){
        System.out.println("What is your next move?");
        System.out.println("1 : Attack \n" +
                            "2 : Switch Skill.Pokemons.Skill.Pokemons.Pokemon \n" +
                            "3 : Use item \n" +
                            "4 : Run");

    }
}
