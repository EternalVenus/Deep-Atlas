package Pokemon.Pokemons;

import Pokemon.Skill.D.*;
import Pokemon.Skill.*;
import Pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;

public class Dragonair extends Pokemon {
    private Skill skill1 = new DragonAscent();
    private Skill skill2 = new DracoMeteor();
    private Skill skill3 = new DragonHammer();
    private Skill skill4 = new DragonTail();
    private ArrayList<Skill> skillSet = new ArrayList<>();
    private String ability;

    public Dragonair() {
        super("Dragonair", null, "148", 61, 84,
                65, 70, 70, 70, new Type("Dragon"), null);

        // moving the 4 skills into an array list
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
        this.ability = "Shed Skin";
    }

    public Dragonair(String nickName) {
        super("Dragonair", nickName, "148", 61, 84,
                65, 70, 70, 70, new Type("Dragon"), null);

        // moving the 4 skills into an array list
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
        this.ability = "Shed Skin";
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

}
