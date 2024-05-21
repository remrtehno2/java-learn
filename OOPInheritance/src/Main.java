public class Main {
    public static void main(String[] args) {
//   Constructor
//        Car ts = new Car("Tesla X10");
//
//        Car ld = new Car("Lada");
//
//        System.out.println(ts.model);
//        System.out.println(ld.model);

//        ElectricalCars elec = new ElectricalCars();
//        elec.model = "Tesla Electrical";
//
//        System.out.println(elec.model);


        BenzinCars benxinCar = new BenzinCars();
        System.out.println(benxinCar.model);
        System.out.println(benxinCar.years);



        Circle circle = new Circle();
        circle.draw();

        Triangle triangle = new Triangle();
        triangle.draw();


        Composition comp = new Composition();
        System.out.println(comp.carComposition.model);
        System.out.println(comp.carComposition.years);
    }
}
