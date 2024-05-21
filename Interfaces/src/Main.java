public class Main {
    public static void main(String[] args) {
//        Dog dog =  new Dog("None");
//        dog.t();

//        AnimalAbstract animalAbstract = new AnimalAbstract();


        Plane plane = new Plane("boeng");
//        plane.fly();
        printNames(plane);

        Car car = new Car("Tesla");
//        car.drive();
//        printNames(car);

//        Transport transport = new Transport();
    }

    public static <T extends Transport> void printNames(T obj) {
        System.out.println("Name is: " + obj.name);
    }
}
