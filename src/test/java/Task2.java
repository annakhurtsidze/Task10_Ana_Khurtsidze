import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");

        List<String> wordsInUpperCase = words.stream().map(word -> word.toUpperCase()).toList();
        for (String word : wordsInUpperCase){
            System.out.println(word);
        }
    }
}
