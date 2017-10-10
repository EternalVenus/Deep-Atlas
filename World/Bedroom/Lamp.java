public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;
    private boolean isOn;
    private LightBulb lightBulb;

    public Lamp(String style, boolean battery, int globRating) {
        this.lightBulb = new LightBulb("White", 10, 5);
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
        this.isOn = false;
    }

    public void turnOn(){
        System.out.println("Switched on the lamp");
        this.isOn = true;
        lightBulb.turnOn(this.isOn);
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
