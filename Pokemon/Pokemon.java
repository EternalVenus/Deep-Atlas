public class Pokemon {
    private String gender;
    private int level;
    private int hp;
    private int exp;
    private String name;

    public Pokemon(String gender, int level, int hp, int exp, String name) {
        this.gender = gender;
        this.level = level;
        this.hp = hp;
        this.exp = exp;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public String getName() {
        return name;
    }
}
