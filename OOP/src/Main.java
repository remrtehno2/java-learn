//import dev.lpa.*;
import dev.lpa.Item;

public class Main {

    public static void main(String[] args) {
        Integer intBoxed = 15;
        int intUnboxed = 15;
        int inboxedByClass = intBoxed.intValue();
        //error
        // int po = intUnboxed.intValue();

        System.out.println(intBoxed.getClass());

        Integer innt = 1000;

        System.out.println(innt.byteValue());


        Cat cat = new Cat();
        cat.setColor("CAT Color: ==== Black and White");
        cat.setColorOfEyes("CAT EYES: ===Grey");
        cat.getColor();
        cat.getColorOfEyes();
        cat.meow();

        SheppardGerman sheppardGerman = new SheppardGerman();
        sheppardGerman.getColor();
        sheppardGerman.getColorOfEyes();
        sheppardGerman.bark();
        //sheppardGerman.isSheppard;

        Poddle poddle = new Poddle();
        poddle.getColor();
        poddle.getColorOfEyes();
        poddle.bark();
        //poddle.isFrench;


        dev.lpa.Item tm = new Item();



//        SensorPhone SensorPhone = new SensorPhone();
//        SensorPhone.getColor();
//        SensorPhone.getModel();
//        SensorPhone.getSize();
//        SensorPhone.touchScreen();
//        boolean isCharched = SensorPhone.isCharched;
//        SensorPhone.call();

//        ButtonPhone buttonPhone = new ButtonPhone();
//        buttonPhone.getColor();
//        buttonPhone.getModel();
//        buttonPhone.getSize();
//        buttonPhone.buttons();
//        boolean isCharchedBtn = buttonPhone.isCharched;
//        buttonPhone.call();
//        buttonPhone.batteryPhone.isCharched();

        ButtonPhone nokia = new ButtonPhone("6PROMAX", "2009", "8cm", "pink");
        nokia.getColor();
        nokia.getModel();
        nokia.getSize();
        System.out.println(nokia.getColor());
        System.out.println(nokia.getModel());
        System.out.println(nokia.getSize());



        SensorPhone apple = new SensorPhone("14PRO", "2020", "15cm", "Space Grey");

        apple.getColor();
        apple.getModel();
        apple.getSize();
        System.out.println(apple.getColor());
        System.out.println(apple.getModel());
        System.out.println(apple.getSize());
        apple.batteryPhone.isCharched();

    }
}

