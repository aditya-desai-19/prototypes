import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aditya");
        list.add("Shubham");
        list.add("Rohit");
        list.forEach((n) -> System.out.println(n));
    }
}
