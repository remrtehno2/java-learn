import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private final List<T> lisOfElements = new ArrayList<>();

    public Layer() {
    }
    public Layer(T elem) {
        lisOfElements.add(elem);
    }

    public void addElements(T elem) {
        lisOfElements.add(elem);
    }
    public void renderLayer() {
        for(T elem : lisOfElements) {
            elem.render();
        }
    }
}
