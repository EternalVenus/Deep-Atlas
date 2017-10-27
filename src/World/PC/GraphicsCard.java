package World.PC;

public class GraphicsCard {
    private String model;
    private String manufacturer;
    private String clock;
    private String cores;
    private int size;


    public GraphicsCard(String model, String manufacturer, String clock, String cores int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.clock = clock;
        this.cores = cores;
        this.size = size;
    }

    public void setModel(String model){
      this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getClock() {
        return clock;
    }

    public String getCores() {
        return cores;
    }

    public int getSize() {
        return size;
    }

}
