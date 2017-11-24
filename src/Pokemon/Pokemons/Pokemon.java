package Pokemon.Pokemons;

import Pokemon.Skill.Skill;
import Pokemon.Type;

public class Pokemon {
    private String name;
    private String nickName;
    private String gender;
    private int level;
    private int exp;
    private String nature;
    private String ID;
    private Type type;

    // all of the stats will the separated into 2 categories. One for Maximum and One for current state
    // This allows the pokemon to restore to original stats when healed
    private int hp;
    private int atk;
    private int spAtk;
    private int defense;
    private int spDefense;
    private int speed;

    // current stats.
    private int currentHp;
    private int currentAtk;
    private int currentSpAtk;
    private int currentDef;
    private int currentSpDef;
    private int currentSpeed;


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

        this.currentHp = this.hp;
        this.currentAtk = this.atk;
        this.currentSpAtk = this.spAtk;
        this.currentDef = this.defense;
        this.currentSpDef = this.spDefense;
        this.currentSpeed = this.speed;
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

    // GETTERS FOR THE Maximum STATS
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

    //GETTERS FOR THE CURRENT STATS

    public int getCurrentHp() {
        return currentHp;
    }

    public int getCurrentAtk() {
        return currentAtk;
    }

    public int getCurrentSpAtk() {
        return currentSpAtk;
    }

    public int getCurrentDef() {
        return currentDef;
    }

    public int getCurrentSpDef() {
        return currentSpDef;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }


    // SETTERS FOR THE Current STATS

    public void setName(String name) {
        this.name = name;
    }

    // method to increase or decrease the current hp
    public void setCurrentHp(int hp) {
        this.currentHp = hp;
    }

    public void setCurrentAtk(int currentAtk) {
        this.currentAtk = currentAtk;
    }

    public void setCurrentSpAtk(int currentSpAtk) {
        this.currentSpAtk = currentSpAtk;
    }

    public void setCurrentDef(int currentDef) {
        this.currentDef = currentDef;
    }

    public void setCurrentSpDef(int currentSpDef) {
        this.currentSpDef = currentSpDef;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
