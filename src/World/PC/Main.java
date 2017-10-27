package World.PC;

public class PCMain {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20, 30, 12);
        Case theCase = new Case("220C", "Dell","360", dimensions);

        Monitor theMonitor = new Monitor("17 inch Giga", "Acer", 21, new Resolution(2540, 1990));
        Motherboard theMotherBoard = new Motherboard("JC-1234", "Asus", 4, 6, "v2.34");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(1,3,"blue");
//        thePC.getMotherBoard().loadProgram("Window 8");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();


    }
}