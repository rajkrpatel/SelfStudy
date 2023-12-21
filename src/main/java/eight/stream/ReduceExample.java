package eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        // creating a list of Strings
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> longestString = words.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        if(longestString.isPresent()){
            System.out.println("Longest String is : "+ longestString.get());
        }
    }
}
