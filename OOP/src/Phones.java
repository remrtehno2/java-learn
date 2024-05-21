public class Phones {

    public BatteryPhone batteryPhone = new BatteryPhone();

    private String model;

    private String color;

    private String size;

    public boolean isCharched = true;

    public void call(){
        System.out.println("ring");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
