package Pokemon.Pokemons;

import Pokemon.Skill.*;
import Pokemon.Skill.A.*;
import Pokemon.Skill.C.*;
import Pokemon.Skill.D.*;
import Pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;

public class Pichu extends Pokemon{
    private Skill skill1 = new DoubleHit();
    private Skill skill2 = new Covet();
    private Skill skill3 = new AuraSphere();
    private Skill skill4 = new ChargeBeam();
    private ArrayList<Skill> skillSet = new ArrayList<>();

    public Pichu(String nickName) {
        // setting the name and the base stats
        super("Pichu", nickName, "172", 20, 40, 15, 35, 35, 60,
                new Type("Electric"), null);
        // moving the 4 skills into an array list
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    // an overload constructor without a nickname
    public Pichu() {
        super("Pichu",  null, "172", 20, 40, 15, 35, 35, 60,
                new Type("Electric"), null);
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
    }

    public Pichu(int level) {
        super("Pichu",  null, "172", 20, 40, 15, 35, 35, 60,
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

}
