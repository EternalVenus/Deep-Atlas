public class Main {
    public static void main(String[] args){
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling(12,23);
        Bed bed = new Bed("Red", 4, 5,3,12);

        Lamp lamp = new Lamp("Blue",false, 10);
        Bedroom bedroom = new Bedroom("My Room", wall1, wall2, wall3,wall4, ceiling,bed,lamp);

        bedroom.makeBed();
        lamp.turnOn();
    }
}