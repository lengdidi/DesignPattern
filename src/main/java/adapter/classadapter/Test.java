package adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Target targer = new ConcreteTarget();
        targer.request();;

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
