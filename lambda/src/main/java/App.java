import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        consumerAddStar(str -> System.out.println(str + "*"));

        myConsumerAddStar(str -> System.out.println(str + "*"));

        System.out.println(functionSquare(num -> num * num, 5));

        System.out.println(myFunctionSquare(num -> num * num, 5));
    }

    public static void consumerAddStar(Consumer consumer) {
        String str = "指定字符串";
        consumer.accept(str);
    }

    public static void myConsumerAddStar(MyConsumer myConsumer) {
        String str = "指定字符串";
        myConsumer.add(str);
    }

    public static int functionSquare(Function<Integer, Integer> square, int number) {
        return square.apply(number);
    }

    public static int myFunctionSquare(MyFunction squ, int number) {
        return squ.suqare(number);
    }
}
