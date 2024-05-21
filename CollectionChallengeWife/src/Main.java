import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        Store store = new Store();
        Cart cart = new Cart(1, List.of("A11", "A22"));

        store.carts.add(cart);
        System.out.println(cart);
    }
}