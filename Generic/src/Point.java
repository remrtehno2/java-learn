public abstract class Point implements Mappable{
    private double[] locationDouble;

    public Point(String location) {
        this.locationDouble = Mappable.stringToLatLon(location);
    }

    @Override
    public void render(){

    }
}
