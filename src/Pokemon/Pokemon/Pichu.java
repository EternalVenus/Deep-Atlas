package Pokemon.Pokemons;

import Pokemon.Pokemon;
import Pokemon.Skill.*;
import Pokemon.Skill.A.AquaJet;
import Pokemon.Skill.A.ArmThrust;
import Pokemon.Skill.A.Astonish;
import Pokemon.Skill.A.AuraSphere;

import java.util.ArrayList;
import java.util.Arrays;

public class Pichu extends Pokemon {
    private Skill skill1 = new Astonish();
    private Skill skill2 = new ArmThrust();
    private Skill skill3 = new AuraSphere();
    private Skill skill4 = new AquaJet();
    private Type type;
    private Type type2;
    private ArrayList<Skill> skillSet = new ArrayList<>();

    public Pichu(String nickName) {
        super("Pichu", nickName, "172", 20, 40, 15, 35, 35, 60);
        this.type = new Type("Electric");
        this.type2 = null;
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    public Pichu() {
        super("Pichu",  null, "172", 20, 40, 15, 35, 35, 60);
        this.type = new Type("Electric");
        this.type2 = null;
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    public Pokemon attack(Pokemon enemy, Skill skill){
        //Calculating damage dealt
//        int damage = ((2 * this.getLevel())/ 5  + 2) * skill.getBaseDamage() *
        System.out.println(this.getName() + " uses " + skill.getName() + " on " + enemy.getName());
//        int damage = this.getAtk() + skill.getBaseDamage() - enemy.getDefense();
//        enemy.damageTaken(damage);
        return enemy;
    }

    @Override
    public void showSkills(){
        System.out.println("===Skill Set===");
        System.out.println("1 :" + skill1.getName() + "\n" +
                "2 :" + skill2.getName() + "\n" +
                "3 :" + skill3.getName() + "\n" +
                "4 :" + skill4.getName());
        System.out.println("===============");
    }

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
