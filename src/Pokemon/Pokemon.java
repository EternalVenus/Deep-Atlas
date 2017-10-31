package Pokemon;

public class Pokemon {
    private String gender;
    private int level;
    private int hp;
    private int exp;
    private String name;
    private int spAtk;
    private int atk;
    private int defense;
    private int spDefense;


    public Pokemon(String name) {
        if (Math.random() < 0.5){
            this.gender = "Male";
        }else{
            this.gender = "Female";
        }
        this.exp = 0;
        this.name = name;
        this.level = (int) (Math.random() * (100 - 5)) + 5;
        this.hp = ((int) (Math.random() * (40 - 5)) + 5) * this.getLevel();
        this.spAtk = ((int) (Math.random() * (10 - 5)) + 5) * this.getLevel();
        this.atk = ((int) (Math.random() * (10 - 5)) + 5) * this.getLevel();
        this.defense = ((int) (Math.random() * (10 - 5)) + 5) * this.getLevel();
        this.spDefense = ((int) (Math.random() * (10 - 5)) + 5) * this.getLevel();

    }

    public int damageTaken(int damage){
        this.hp = this.getHp() - damage;
        return this.hp;
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

    public int getSpAtk() {
        return spAtk;
    }

    public int getAtk() {
        return atk;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpDefense() {
        return spDefense;
    }
}
