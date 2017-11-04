package Pokemon;

import Pokemon.Skill.Skill;

public class Pokemon {
    private String name;
    private String nickName;
    private String gender;
    private int level;
    private int exp;
    private String nature;

    // stats
    private int hp;
    private int atk;
    private int spAtk;
    private int defense;
    private int spDefense;
    private int speed;

    //base stats
    private int baseHp;
    private int baseAtk;
    private int baseSpAtk;
    private int baseDefense;
    private int baseSpDefense;
    private int baseSpeed;

    // other stats
    private int IV;
    private int EV;

    public Pokemon(String name, int baseHp, int baseAtk, int baseSpAtk,
                   int baseDef, int baseSpDef, int baseSpeed) {

        // gives a 50% chance to both female and male
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

        // initializing the base stats of a pokemon
        this.baseHp = baseHp;
        this.baseAtk = baseAtk;
        this.baseSpAtk = baseSpAtk;
        this.baseDefense = baseDef;
        this.baseSpDefense = baseSpDef;
        this.baseSpeed = baseSpeed;
    }


    public Pokemon(String name, String nickName) {
        if (Math.random() < 0.5){
            this.gender = "Male";
        }else{
            this.gender = "Female";
        }
        this.nickName = nickName;
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

    public void showSkills(){
        //this function will be override
        System.out.println("Showing skills of the pokemon.");
    }

    public Skill getSkill1() {
        return new Skill();
    }

    public Skill getSkill2() {
        return new Skill();
    }

    public Skill getSkill3() {
        return new Skill();
    }

    public Skill getSkill4() {
        return new Skill();
    }

    public String getNickName() {
        if (this.nickName != null){
            return this.nickName;
        }else{
            return this.getName();
        }

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
