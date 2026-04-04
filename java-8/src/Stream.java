import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adktie", "tomato", "banana", "whey");
        list.stream()
                .map(x -> x.toUpperCase())
                .forEach(x -> System.out.println(x));

        // How stream api works
        // Source -> Intermediate operations -> Terminal operation

        // Source
        // list.stream()

        // Intermediate operation
        // map(), filter(), sorted(), distinct()

        // Terminal operation
        // forEach(), collect(), count(), reduce()

    }
}
