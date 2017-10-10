public class LightBulb{
    private String color;
    private int lightScale;
    private int size;
    
    public LightBulb(String color, int lightScale, int size){
        this.color = color;
        this.lightScale = lightScale;
        this.size = size;
    }
    
    public void turnOn(boolean isOn){
        if(isOn){
            System.out.println("Lightbulb is glowing with a " + color + " color");
        }else{
            System.out.println("Lightbulb is not turning on");
        }
    }
    
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setLightScale(int lightScale){
        this.lightScale = lightScale;
    }
    
    
    // getters
    public void getColor(){
        return this.color;
    }
    
    public void getLightScale(){
        return this.lightScale;
    }
    
    public void getSize(){
        return this.size;
    }
}