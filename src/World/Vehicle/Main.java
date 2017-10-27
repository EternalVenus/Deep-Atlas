package World.Vehicle;

public class VehicleMain {
    public static void main(String[] args){
        Outlander outlander = new Outlander(40);
        outlander.steer(90);

        outlander.accelerate(20);
        outlander.accelerate(60);
    }
}
