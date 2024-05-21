public class Car {

    private int engine;
    private int doors;
    private String name;

    public Car(){
        this.engine = 8;
        this.doors = 4;
        this.name = "No name";
    }
    public Car(int engine){
        this.engine = engine;
        this.doors = 4;
        this.name = "No name";
    }
    public Car(int engine, int doors){
        this.engine = engine;
        this.doors = doors;
        this.name = "No name";
    }
    public Car(int engine, int doors, String model){
        this.engine = engine;
        this.doors = doors;
        this.name = model;
        System.out.println("doors: 4" + doors);
    }

}