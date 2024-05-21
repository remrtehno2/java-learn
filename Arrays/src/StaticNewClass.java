public class StaticNewClass {
    public String name;

    public StaticNewClass(String name) {
        this.name = name;
    }

    static StaticNewClass getInstance() {
        return new StaticNewClass("Hi");
    }
}
