package mediator;

/**
 * 中介者模式
 */
public class Test {
    public static void main(String[] args) {
        User legend = new User("Legend");
        User tom = new User("Tom");

        legend.sendMessage("Hi Tom!");
        legend.sendMessage("Hi Legend!");
    }
}
