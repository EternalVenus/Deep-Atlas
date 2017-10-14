package Biosphere.Animals.Abstracts;

public abstract class Hunter extends Animal {

    //Bonus multiplier to stats
    static int CRIT_BONUS = 2;

    protected abstract void Stalk();
    protected abstract void Strike();
}