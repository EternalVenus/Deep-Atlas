public class Keyboard {
    private String type;
    private String manufacturer;
    private Boolean backlight;
    private String color;

    public GraphicsCard(String model, String manufacturer, String clock, String cores int size) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.backlight = backlight;
        this.color = color;
    }

    public void setType(String type){
      this.type = type;
    }

    public void setColor(String color){
      this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Boolean getBacklight() {
        return backlight;
    }

    public String getColor() {
        return color;
    }

}
