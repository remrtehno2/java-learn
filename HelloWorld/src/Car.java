class CarModel {
    public String model = "Tesla";

    public void move() {
        System.out.println("Move");
    }
}


class Tesla {
    public static String model = "Tesla";
    public static int year = 2024;
    // State = Characteristics
    private static String color = "Red";

    // Behaviour = Actions.
    public static void move() {
        System.out.println("Move");
    }

    private static void signal() {
        System.out.println("signal");
    }
}


public class Car {
    public static void main(String[] args) {
        System.out.println(Tesla.model);
        System.out.println(Tesla.year);
        Tesla.move();

        // Can't access
        // Tesla.signal();
        //System.out.println(Tesla.color);

        //instance
        CarModel TeslaInstance = new CarModel();
        TeslaInstance.move();
        TeslaInstance.model;


        CarModel Jiguli = new CarModel();
        Jiguli.move();
        Jiguli.model;


    }
}


