package Pokemon.Pokemons;

import Pokemon.Skill.D.*;
import Pokemon.Skill.*;
import Pokemon.Type;

import java.util.ArrayList;
import java.util.Arrays;

public class Dragonite extends Pokemon{
    private Skill skill1 = new DragonAscent();
    private Skill skill2 = new DracoMeteor();
    private Skill skill3 = new DragonHammer();
    private Skill skill4 = new DragonTail();
    private ArrayList<Skill> skillSet = new ArrayList<>();
    private String ability;

    public Dragonite() {
        super("Dragonite", null, "149", 91, 134,
                95, 100, 100, 80, new Type("Dragon"), new Type("Flying"));

        // moving the 4 skills into an array list
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
        this.ability = "Inner Focus";
    }

    public Dragonite(String nickName) {
        super("Dragonite", nickName, "149", 91, 134,
                95, 100, 100, 80, new Type("Dragon"), new Type("Flying"));

        // moving the 4 skills into an array list
        this.skillSet.addAll(Arrays.asList(skill1, skill2, skill3, skill4));
        this.ability = "Inner Focus";
    }

    // Listing the skill set for Pokemon Battle
    @Override
    public void showSkills(){
        System.out.println("✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧ Skill Set ✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧");
        System.out.println("\t\t\t\t\t  " + "1: " + skill1.getName() + "  PP: " + skill1.getPP() + "\n" +
                "\t\t\t\t\t  " + "2: " + skill2.getName() + "  PP: " + skill2.getPP() + "\n" +
                "\t\t\t\t\t  " + "3: " + skill3.getName() + "  PP: " + skill3.getPP() +"\n" +
                "\t\t\t\t\t  " + "4: " + skill4.getName() + "  PP: " + skill4.getPP());
        System.out.println("✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧");
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
