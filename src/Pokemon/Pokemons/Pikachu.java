package Pokemon.Pokemons;

import Pokemon.Skill.*;
import Pokemon.Skill.A.AncientPower;
import Pokemon.Skill.A.AuraSphere;
import Pokemon.Skill.A.AuroraBeam;
import Pokemon.Skill.B.*;
import Pokemon.Type;

import java.util.ArrayList;
import java.util.*;

public class Pikachu extends Pokemon{
    private Skill skill1 = new BoltStrike();
    private Skill skill2 = new AncientPower();
    private Skill skill3 = new AuraSphere();
    private Skill skill4 = new AuroraBeam();
    private Type type;
    private Type type2;
    private ArrayList<Skill> skillSet = new ArrayList<>();


    public Pikachu(String nickName) {
        super("Pikachu", nickName, "025", 35, 55, 30,50,40, 90 );
        this.type = new Type("Electric");
        this.type2 = null;
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    public Pikachu() {
        super("Pikachu", null,"025", 35, 55, 30,50,40, 90);
        this.type = new Type("Electric");
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

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


    @Override
    public void showSkills(){
        System.out.println();
        System.out.println("===Skill Set===");
        System.out.println("| 1 :" + skill1.getName() + " |\n" +
                "| 2 :" + skill2.getName() + " |\n" +
                "| 3 :" + skill3.getName() + " |\n" +
                "| 4 :" + skill4.getName() +  " |");
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

    @Override
    public Type getType() {
        return type;
    }
}
