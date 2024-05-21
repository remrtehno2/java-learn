public class Park extends Point {
    private String name;
    private String location;

    public Park(String name, String location) {
        super(location);
        this.name = name;
        this.location = location;

    }

    @Override
    public void render() {
        super.render();
        System.out.printf("Park name: [%s]. Location is: [%s].", name, location);
    }
}
