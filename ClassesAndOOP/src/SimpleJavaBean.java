public class SimpleJavaBean {
    private String name;
    private int age;
    private String address;

    // Constructors
    public SimpleJavaBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age2) {
        age = age2;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String arg) {
        address = arg;
    }
}
