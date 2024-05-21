public abstract class Line implements Mappable{
    private double[][] locationDouble;

    public Line(String location) {
        this.locationDouble[0] = Mappable.stringToLatLon(location);
    }

    public Line(double[][] locationDouble) {
        this.locationDouble = locationDouble;
    }

    @Override
    public void render() {

    }
}