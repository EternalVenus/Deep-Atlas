package Pokemon.Pokemons;

import Pokemon.Pokemon;
import Pokemon.Skill.*;
import Pokemon.Skill.A.Absorb;
import Pokemon.Skill.A.ArmThrust;
import Pokemon.Skill.A.Astonish;
import Pokemon.Skill.A.AuraSphere;
import Pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;

public class Pichu extends Pokemon implements IPokemon{
    private Skill skill1 = new Astonish();
    private Skill skill2 = new ArmThrust();
    private Skill skill3 = new AuraSphere();
    private Skill skill4 = new Absorb();
    private Type type;
    private Type type2;
    private ArrayList<Skill> skillSet = new ArrayList<>();

    public Pichu(String nickName) {
        // setting the name and the base stats
        super("Pichu", nickName, "172", 20, 40, 15, 35, 35, 60);
        this.type = new Type("Electric");
        // there is no second type. setting it to null
        this.type2 = null;
        // moving the 4 skills into an arraylist
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    // an overload constructor without a nickname
    public Pichu() {
        super("Pichu",  null, "172", 20, 40, 15, 35, 35, 60);
        this.type = new Type("Electric");
        this.type2 = null;
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    // STILL NEED TO FIND THE MODIFIER VALUE
    public Pokemon attack(Pokemon enemy, Skill skill){
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
//
//        enemy.
//        int damage = this.getAtk() + skill.getBaseDamage() - enemy.getDefense();
//        enemy.damageTaken(damage);
        return enemy;
    }

    // Listing the skill set for Pokemon Battle
    @Override
    public void showSkills(){
        System.out.println("===Skill Set===");
        System.out.println("1 :" + skill1.getName() + "\n" +
                "2 :" + skill2.getName() + "\n" +
                "3 :" + skill3.getName() + "\n" +
                "4 :" + skill4.getName());
        System.out.println("===============");
    }

    // Gets one of the 4 skills
    @Override
    public Skill getSkill1() {
        return skill1;
    }
    @Override
    public Skill getSkill2() {
        return skill2;
    }
    @Override
    public Skill getSkill3() {
        return skill3;
    }
    @Override
    public Skill getSkill4() {
        return skill4;
    }

    public Type getType() {
        return type;
    }


}
