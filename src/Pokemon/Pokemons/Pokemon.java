package Pokemon.Pokemons;

import Pokemon.Skill.Skill;
import Pokemon.*;

public class Pokemon {
    private String name;
    private String nickName;
    private String gender;
    private int level;
    private int exp;
    private Nature nature;
    private String ID;
    private Type type;
    private Type type2;

    // all of the stats will the separated into 2 categories. One for Maximum and One for current state
    // This allows the pokemon to restore to original stats when healed
    private int hp;
    private int atk;
    private int spAtk;
    private int defense;
    private int spDefense;
    private int speed;

    // current stats (These will be used for pokemon battle)
    private int currentHp;
    private int currentAtk;
    private int currentSpAtk;
    private int currentDef;
    private int currentSpDef;
    private int currentSpeed;


    //base stats. used to calculate maximum stats
    private int baseHp;
    private int baseAtk;
    private int baseSpAtk;
    private int baseDefense;
    private int baseSpDefense;
    private int baseSpeed;

    // other stats. These stats will be randomly generated to be calculated in the maximum stat
    private int IV;
    private int EV;

    // stat multipliers
    private int atkMultiplier;
    private int spAtkMultiplier;
    private int defenseMultiplier;
    private int spDefenseMultiplier;
    private int speedMultiplier;

    public Pokemon(String name, String nickName, String ID,  int baseHp, int baseAtk,
                   int baseDef, int baseSpAtk, int baseSpDef, int baseSpeed, Type type1, Type type2) {

        // gives a 50% chance to both female and male
        if (Math.random() < 0.5){
            this.gender = "Male";
        }else{
            this.gender = "Female";
        }

        this.nickName = nickName;
        this.name = name;
        this.ID = ID;
        this.type = type1;
        this.type2 = type2;

        // GENERATE RANDOM IV AND EV
        // Maximum value for EV is 252
        // Maximum value for IV is 15
        this.IV = (int)(Math.random() * 15);
        this.EV = (int)(Math.random() * 253);


        // CALCULATING MAX STATS FROM BASE STATS
        // generating a random level
        this.level = (int) (Math.random() * 95) + 5; // random number from 5 - 100
        this.exp = 0;
        // using the formula to calculate maximum stats
        this.hp = (int)Math.floor(((2 * baseHp + this.IV + Math.floor(EV/4)) * this.level)/ 100) + this.level + 10;
        this.spAtk = (int)Math.floor((Math.floor(((2 * baseSpAtk + this.IV + Math.floor(this.EV/4))* this.level)/100) + 5) * 1 );
        this.atk = (int)Math.floor((Math.floor(((2 * baseAtk + this.IV + Math.floor(this.EV/4))* this.level)/100) + 5) * 1 );
        this.defense = (int)Math.floor((Math.floor(((2 * baseDef + this.IV + Math.floor(this.EV/4))* this.level)/100) + 5) * 1 );
        this.spDefense = (int)Math.floor((Math.floor(((2 * baseSpDef + this.IV + Math.floor(this.EV/4))* this.level)/100) + 5) * 1 );
        this.speed = (int)Math.floor((Math.floor(((2 * baseSpeed + this.IV + Math.floor(this.EV/4))* this.level)/100) + 5) * 1 );

        // initializing the base stats of a pokemon
        this.baseHp = baseHp;
        this.baseAtk = baseAtk;
        this.baseSpAtk = baseSpAtk;
        this.baseDefense = baseDef;
        this.baseSpDefense = baseSpDef;
        this.baseSpeed = baseSpeed;

        // Setting full health of pokemon when created
        this.currentHp = this.hp;
        this.currentAtk = this.atk;
        this.currentSpAtk = this.spAtk;
        this.currentDef = this.defense;
        this.currentSpDef = this.spDefense;
        this.currentSpeed = this.speed;

        // Setting all stat multiplier by 1 when declared
        this.atkMultiplier = 1;
        this.spAtkMultiplier = 1;
        this.defenseMultiplier = 1;
        this.spDefenseMultiplier = 1;
        this.speedMultiplier = 1;
    }

    public int damageTaken(int damage){
        this.hp = this.getHp() - damage;
        return this.hp;
    }

    // STILL NEED TO FIND THE MODIFIER VALUE
    public boolean attack(Pokemon enemy, Skill skill){
        int damage;
        //Calculating damage dealt
        // still need to calculate modifier
        if (skill.getCategory().equals("Physical")){
            damage = ((((2 * this.getLevel())/ 5  + 2) * skill.getBaseDamage() *
                    this.getAtk()/ enemy.getDefense())/ 50 + 2);
        }else{
            damage = ((((2 * this.getLevel())/ 5  + 2) * skill.getBaseDamage() *
                    this.getSpAtk()/ enemy.getSpDefense())/ 50 + 2);
        }

        enemy.damageTaken(damage);
        return true;
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

    public void restoreToBaseMultiplier(){
        setAtkMultiplier(1);
        setDefenseMultiplier(1);
        setSpDefenseMultiplier(1);
        setSpAtkMultiplier(1);
        setSpeedMultiplier(1);
    }

    // This method will be used for in the pokemon center
    public void restoreToFullHealth(){
        setCurrentHp(this.getHp());
        // still need to implement restore to full PP
    }

    // ====GETTERS FOR DETAILS ON THE POKEMON====

    public String getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public String getNature() {
        return nature.getNature();
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

    //===== GETTERS FOR THE Maximum STATS========
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

    //=======GETTERS FOR THE CURRENT STATS==========

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

    //=======GETTERS FOR THE STAT MULTIPLIERS ===========
    public int getBaseHp() {
        return baseHp;
    }

    public int getAtkMultiplier() {
        return atkMultiplier;
    }

    public int getSpAtkMultiplier() {
        return spAtkMultiplier;
    }

    public int getDefenseMultiplier() {
        return defenseMultiplier;
    }

    public int getSpDefenseMultiplier() {
        return spDefenseMultiplier;
    }

    public int getSpeedMultiplier() {
        return speedMultiplier;
    }

    // ======SETTERS FOR THE STAT MULTIPLIERS==================

    public void setAtkMultiplier(int atkMultiplier) {
        this.atkMultiplier = atkMultiplier;
    }

    public void setSpAtkMultiplier(int spAtkMultiplier) {
        this.spAtkMultiplier = spAtkMultiplier;
    }

    public void setDefenseMultiplier(int defenseMultiplier) {
        this.defenseMultiplier = defenseMultiplier;
    }

    public void setSpDefenseMultiplier(int spDefenseMultiplier) {
        this.spDefenseMultiplier = spDefenseMultiplier;
    }

    public void setSpeedMultiplier(int speedMultiplier) {
        this.speedMultiplier = speedMultiplier;
    }

    // SETTERS FOR THE Current STATS
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


    // SETTERS FOR DETAILS OF THE POKEMON
    public void setName(String name) {
        this.name = name;
    }
}
