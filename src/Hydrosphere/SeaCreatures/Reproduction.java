public interface Reproduction {
    void description;
    void setBabies;
    void setBabiesMultiplier;
    
}

class Oviparous implements Reproduction{ // group that lays eggs 

    int base;       // not outside since they would be final
    int multiplier;
    
    public void description(){
        System.out.println("The mother gave laid eggs")
    }
    
    public void setBabies(int base){
        this.base = base;
    }
    
    public void setBabiesMultiplier(int multiplier){
        this.multiplier = multiplier;
    }
}

class Viviparous implements Reproduction{ // group that give live birth

    int base;
    int multiplier;
    
    public void description(){
        System.out.println("the mother has given live birth")
    }
    
    public void setBabies(int base){
        this.base=base;
    }
    
    public void setBabiesMultiplier(int multiplier){
        this.multiplier = multiplier;
    }
}