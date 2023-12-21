package eight.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("This", "is", "a", "Sample", "String", "Array");

        arr.parallelStream().forEach(System.out::print);
    }
}
