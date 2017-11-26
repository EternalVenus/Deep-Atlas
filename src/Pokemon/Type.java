package Pokemon;

public class Type {
    private String[] allTypes = {"Normal", "Fire", "Fighting", "Water", "Flying", "Grass", "Poison", "Electric",
                                "Ground", "Psychic", "Rock", "Ice", "Bug", "Dragon", "Ghost", "Dark", "Steel",
                                "Fairy"};
    private String type;

    public Type(String type){
        for (String x : allTypes) {
            if (x == type) {
                this.type = type;
            }
        }
    }

    // Used for damage modifier (super effective etc)
    public Type(){
        this.type = null;
    }

    public double typeEffectiveCalculation(String...a){
        float d=1;

        for(String B:a[1].split("/"))
            d*=("222221201222222222421124104222214241242221421224122222222111210224222224220424124421422222214212421422224222211122211124242241022222242222242212222224221112124224222221424114224122222244222411222122221144121141222122224202222241122122242422221222212202224242221114221422222222221222222420212222242222242211242122221122222442"
                    .charAt(findAbbreviationIndex(a[0])*18+findAbbreviationIndex(B))-48)*.5;
        return d;
    }

    private int findAbbreviationIndex(String a){
        int i=0;
        for(;i<18;i++)
            if(a.contains("N,gh,ly,oi,ou,ck,B,ho,S,re,W,G,E,P,I,g,k,y".split(",")[i]))
                break;
        return i;
    }

    public String getType() {
        return this.type;
    }
}
