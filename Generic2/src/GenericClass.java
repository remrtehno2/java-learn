public class GenericClass<T, U> {
    public T field1;
    public U field2;
//    public String field3;

    public GenericClass(T field1, U field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void getMethod(T arg1) {

    }

    public T getMethod2(String arg1) {
        return (T) arg1;
    }

    public <K> void getMethod3(K arg1) {

    }

    public <K> void getMethod4(K arg1, T arg2) {

    }

}
