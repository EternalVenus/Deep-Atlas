package Hydrosphere.SeaCreatures.Fish;

public interface Toxin {
    void toxin();
}

class tetrodotoxin implements Toxin { // puffer fish
    @Override
    public void toxin() {
        System.out.println("a deadly poison that has no cure!");
    }
    
class acetylcholine implements Toxin { // lion fish
    @Override
    public void toxin() {
        System.out.println("The venom is a combination of protein: a neuromuscular toxin and a neurotransmitter. Heat can help break down the toxin");
    }
    
class neurotoxin implements Toxin { // sea anemone
    @Override
    public void toxin() {
        System.out.println("The venom discorages prey from snacking on it");
    }
}