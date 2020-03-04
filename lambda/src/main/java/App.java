import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Consumer consumer = str -> System.out.println(str + "*");
        consumer.accept("Hello");
        MyConsumer myConsumer = str ->  System.out.println(str + "*");
        myConsumer.add("World");

        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(5));
        MyFunction myFunction = num -> num * num;
        System.out.println(myFunction.suqare(5));
    }
}
