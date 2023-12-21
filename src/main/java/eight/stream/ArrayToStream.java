package eight.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {

        String[] stringArr = {"this", "is", "test", "string", "array"};
        stringArrTOStream(stringArr);

        int[] intArr = {1,2,3,10,9,6,8,4,5,6};
        intArrToStream(intArr);
    }

    static void stringArrTOStream(String[] strings){
        Stream<String> stringStream = Arrays.stream(strings);

        stringStream.forEach((s) -> System.out.print(s + " "));
    }

    static void intArrToStream(int[] intArr){
        IntStream stream = Arrays.stream(intArr);
        stream.sorted().forEach(System.out::print);

        Stream<int[]> intArr1 = Stream.of(intArr);
        System.out.println();
        intArr1.forEach(System.out::print);
    }
}
