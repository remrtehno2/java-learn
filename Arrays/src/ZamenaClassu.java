
public record ZamenaClassu(String name, int age) {
    @Override
    public String name() {
        return name;
    }
}


class ZamenaClassu2 {
    private String name;
    private int age;

    public ZamenaClassu2(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
