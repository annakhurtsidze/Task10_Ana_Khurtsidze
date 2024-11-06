import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");


        List<String> sortedList = names.stream().sorted().toList();

        Iterator<String> iterator = sortedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
