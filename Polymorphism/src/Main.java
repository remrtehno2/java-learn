public class Main {
    public static void main(String[] args) {
        ButtonPhone nokia = new ButtonPhone();
        SensorPhone apple = new SensorPhone();

        callPhone(nokia);
        callPhone(apple);

        // polimorphism
        Phone nokia2 = new ButtonPhone();
        Phone apple2 = new SensorPhone();

        nokia2.call();
        apple2.call();

        // перегрузка методов
        nokia.getContact("Vasya");
        nokia.getContact(900);

        //polimorphism с контсрукторами
        Phone nokia3 = new ButtonPhone("Hi am argument 1 String");
        Phone nokia4 = new ButtonPhone(500);
        Phone apple3 = new ButtonPhone("Hi am argument 1 String", "Hi am argument 2 String");



        Car Malibu = new Car();
        Car Ferrari = new Car(4);
        Car Malibu3 = new Car(4, 4);
        Car t = new Car(4, 8, "Tesla");


        // interface polymorphism

        Charchable nokiaCharchable = new Phone();
        nokiaCharchable.isCharged();
    }

    // polimorphism
    public static void callPhone(Phone phone) {

        phone.call();
    }
    // была проблема дубликата двух методов одинаковых
    //    public static void callPhone2(ButtonPhone nokia) {
    //        nokia.call();
    //    }

}
