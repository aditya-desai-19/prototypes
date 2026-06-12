import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequencedCollectionFeature {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        /*
            Previously: list.get(0) and list.get(list.size() - 1)
            Now: list.getFirst() and list.getLast()
         */
        System.out.println(list.getFirst() + " " + list.getLast());
    }
}
