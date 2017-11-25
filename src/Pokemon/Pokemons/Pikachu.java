package Pokemon.Pokemons;

import Pokemon.Skill.*;
import Pokemon.Skill.A.*;
import Pokemon.Skill.B.*;
import Pokemon.Skill.C.ChargeBeam;
import Pokemon.Skill.C.Covet;
import Pokemon.Skill.D.DoubleHit;
import Pokemon.Type;

import java.util.ArrayList;
import java.util.*;

public class Pikachu extends Pokemon{
    private Skill skill1 = new BoltStrike();
    private Skill skill2 = new DoubleHit();
    private Skill skill3 = new AuraSphere();
    private Skill skill4 = new ChargeBeam();
    private ArrayList<Skill> skillSet = new ArrayList<>();


    public Pikachu(String nickName) {
        super("Pikachu", nickName, "025", 35, 55, 30,50,40, 90 ,
                new Type("Electric"), null);
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    public Pikachu() {
        super("Pikachu", null,"025", 35, 55, 30,50,40, 90,
                new Type("Electric"), null);
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    // FOR TESTING PURPOSE
    public Pikachu(int level) {
        super("Pikachu", null,"025", 35, 55, 30,50,40, 90,
                new Type("Electric"), null, level);
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    // Listing the skill set for Pokemon Battle
    @Override
    public void showSkills(){
        System.out.println("===Skill Set===");
        System.out.println("1: " + skill1.getName() + "\n" +
                "2: " + skill2.getName() + "\n" +
                "3: " + skill3.getName() + "\n" +
                "4: " + skill4.getName());
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

}
