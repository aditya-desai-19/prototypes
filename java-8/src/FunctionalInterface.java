import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Good morning");
        g.greet();

        // Default functional interface
        // 1. Predicate: used for checking condition
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));


        // 2. Function<T, R>: used to transform data
        Function<String, Integer> strToInt = x -> x.length();

        System.out.println(strToInt.apply("Aditya"));

        // 3. Consumer<T>: used when you want to consume data and don't want to return anything
        Consumer<String> consumer = x -> System.out.println(x);

        consumer.accept("Aditya");

        // 4. Supplier: used to return value without input
        Supplier<Integer> getDefaultVal = () -> 10000;
        System.out.println(getDefaultVal.get());
    }
}

// Interface with only one abstract method
// What problem it solves -> helps in writing lambda expression
@java.lang.FunctionalInterface
interface Greeting {
    void greet();

    // Default method
    default void sayHello() {
        System.out.println("Hello");
    }
}




