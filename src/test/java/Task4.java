import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");

        List<String> filteredWordsByLength = words.stream().filter(word -> word.length() >4).toList();


        List<String> orderedList = filteredWordsByLength.stream().map(word -> word.toLowerCase()).sorted().toList();

        orderedList.forEach(System.out::println);
    }
}
