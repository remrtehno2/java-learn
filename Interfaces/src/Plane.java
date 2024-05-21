public class Plane extends Transport implements Flyable{

    public Plane(String name) {
        super(name);
    }

    public void fly(){
        System.out.println("Fly");
    }
}
