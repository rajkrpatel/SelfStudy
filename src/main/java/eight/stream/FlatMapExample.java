package eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> ar1 = Arrays.asList(1,2,3);
        List<Integer> ar2 = Arrays.asList(4,5,6);
        List<Integer> ar3 = Arrays.asList(7,8,9);

        List<List<Integer>> ll = Arrays.asList(ar1,ar2,ar3);

        ll.stream().flatMap(x-> x.stream()).forEach(System.out::print);
    }
}
