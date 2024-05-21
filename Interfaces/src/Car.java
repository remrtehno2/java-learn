public class Car extends Transport implements Driveable{
    public Car(String name) {
        super(name);
    }

    public void drive(){
        System.out.println("drive");
    }


}
