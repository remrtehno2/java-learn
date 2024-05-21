import java.util.ArrayList;
import java.util.List;

public class Cart {

    public int id;
    public List<String> products;

    public Cart(int id, List<String> products) {
        this.id = id;
        this.products = products;
    }
}
