public class Dog extends AnimalAbstract implements IDog, Runable {
    public Dog(String val) {
        super(val);
    }

    public void bark() {
        System.out.println("Bark");
    }
    public void eat() {

    }

    public void run() {

    }
}
