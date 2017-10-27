package Skill;
import Skill.Pokemons.Type;

public class Psychic extends Skill{

        private static final String name = "Psychic";
        private static final Type type = new Type("Psychic");
        private static final String ID = "TM29";
        private static final int baseDamage = 90;
        private static final String description = "Psychic deals damage and has a 10% chance of lowering the target's Special Defense by one stage.\n" +
                "Stats can be lowered to a minimum of -6 stages each.";

        public Psychic() {
            super(this.ID, this.name, this.type, this.baseDamage , this.description);
        }

        @Override
        public int effect(Pokemon pokemon) {
            return super.effect(pokemon);
        }

        @Override
        public String getID() {
            return this.ID;
        }

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public Type getType() {
            return this.type;
        }

        @Override
        public int getBaseDamage() {
            return this.baseDamage;
        }

        @Override
        public String getDescription() {
            return this.description;
        }

}
