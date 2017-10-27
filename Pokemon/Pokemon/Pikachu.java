package Skill.Pokemons;
import Skill.*;


public class Pikachu extends Pokemon {
    private String nickName;
    private Skill skill1 = new BoltStrike();
    private Skill skill2 = new Catastropika();
    private Skill skill3 = new FusionBolt();
    private Skill skill4 = new TailWhip();
    private Type type;
    private String description = "Whenever Pikachu comes across something new, it blasts it with a jolt of electricity.\n" + 
                                    "If you come across a blackened berry, it's evidence that this Pokémon mistook the intensity of its charge."


    public Pikachu(String nickName) {
        super("Pikachu");
        this.nickName = nickName;
        this.type = new Type("Electric");
    }

    public Pikachu() {
        super("Pikachu");
        this.nickName = null;
        this.type = new Type("Electric");
    }

    private Pokemon attack(Pokemon enemy, Skill skill){
        System.out.println(super.getName() + " uses " + skill.getName() + " on " + enemy.getName());
        int damage = super.getAtk() + skill.getBaseDamage() - enemy.getDefense();
        enemy.damageTaken(damage);
        return enemy;
    }

    public String getNickName() {
        if (this.nickName != null){
            return nickName;
        }else{
            return super.getName();
        }

    }


    public void showSkills(){
        System.out.println("1 :" + skill1.getName() + "\n" +
                            "2 :" + skill2.getName() + "\n" +
                            "3 :" + skill3.getName() + "\n" +
                            "4 :" + skill4.getName());
    }


    public Skill getSkill1() {
        return skill1;
    }

    public Skill getSkill2() {
        return skill2;
    }

    public Skill getSkill3() {
        return skill3;
    }

    public Skill getSkill4() {
        return skill4;
    }

    public Type getType() {
        return type;
    }
}
