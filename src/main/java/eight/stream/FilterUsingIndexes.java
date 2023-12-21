package eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FilterUsingIndexes {
    public static void main(String[] args) {
        String[] myArray
                = new String[] { "stream",   "is",  "a",
                "sequence", "of",  "elements",
                "like",     "list" };

        AtomicInteger ai = new AtomicInteger(0);
        List<String> evenIndexs = Arrays.stream(myArray).filter(x -> ai.getAndIncrement() % 2 == 0).collect(Collectors.toList());

        System.out.println(evenIndexs);
    }
}
