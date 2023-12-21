package eight.stream.program;

import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        Object[] objects = stream.sorted().toArray();

        for(Object i : objects){
            System.out.println(i + " ");
        }

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);

        int[] ints = stream1.mapToInt(i -> i.intValue()).toArray();
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
