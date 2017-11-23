package Pokemon;

import Pokemon.Skill.Skill;

public class Pokemon {
    private String name;
    private String nickName;
    private String gender;
    private int level;
    private int exp;
    private String nature;
    private String ID;
    private Type type;
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

    public Pokemon(String name, String nickName, String ID,  int baseHp, int baseAtk, int baseDef, int baseSpAtk,
                    int baseSpDef, int baseSpeed) {

        // gives a 50% chance to both female and male
        if (Math.random() < 0.5){
            this.gender = "Male";
        }else{
            this.gender = "Female";
        }

        this.nickName = nickName;
        this.name = name;
        this.ID = ID;

        this.exp = 0;
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

    public int damageTaken(int damage){
        this.hp = this.getHp() - damage;
        return this.hp;
    }

    // methods to be Override
    public void showSkills(){
        //this function will be override
        System.out.println("Showing skills of the pokemon.");
    }

    // to be overridden
    public Skill getSkill1() {
        return null;
    }

    public Skill getSkill2() {
        return null;
    }

    public Skill getSkill3() {
        return null;
    }

    public Skill getSkill4() {
        return null;
    }

    public String getNickName() {
        if (this.nickName != null){
            return this.nickName;
        }else{
            return this.getName();
        }

    }

    // GETTERS FOR DETAILS ON THE POKEMON
    public String getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public String getNature() {
        return nature;
    }

    public int getIV() {
        return IV;
    }

    public int getEV() {
        return EV;
    }

    public int getExp() {
        return exp;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public Type getType() {
        return type;
    }

    // GETTERS FOR THE STATS
    public int getHp() {
        return hp;
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

    public int getSpeed() {
        return speed;
    }

    // SETTERS FOR THE STATS

    // subtract Hp after taking damage
    public void setHp(int damage) {
        this.hp -= damage;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpDefense(int spDefense) {
        this.spDefense = spDefense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
