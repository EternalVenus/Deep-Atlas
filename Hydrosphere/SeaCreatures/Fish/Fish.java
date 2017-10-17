public abstract class Fish{ // abstract - cannot be instantiated. Only purpose is for other classes to extend
    public void gills(){
        System.out.println(" Gills are important organs for a fish, as they are responsible for respiration. ");
    }

    public void swimBladder(){
        System.out.println("a bladder that can be filled with air to help to ensure that the fish can control the degree of which they float or sink");
    }

    public void lateralLine(){
        System.out.println("a specialized sense organ that runs along the length of the body under the scales. The lateral line helps detect vibrations and potential food.");
    }

    public int fins(){
        System.out.println("Fins enable fishes to move freely. The pelvic and pectoral fins helps maintain stability while the dorsal and ventral fins prevents rolling and alows turning and the tail fin propels the fish forward.");
    }    
    
    public void coldBlooded(){
        System.out.println("They cannot regulate their body temperature and are dependent on the external environment");
    }
    
       public void eat(){
        System.out.println("meal-time!");
    }
     

}
