import java.time.LocalDate;
import java.util.List;

public class Cart {
    public static enum TypeCart {
        PHYSICAL, VIRTUAL
    }
    public static int idInc = 1;
    private int id;
    private int totalProducts;
    private LocalDate date;
    private TypeCart type;

    public Cart(int totalProducts, LocalDate date, TypeCart type) {
        this.totalProducts = totalProducts;
        this.date = date;
        this.type = type;
        this.id = idInc++;
    }

    public void addItem() {

    }
    public void removeItem() {

    }
    public void printSalesSlip() {

    }
}
