package eight.lamda;

import java.util.TreeSet;

public class ReverseComparatorInTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((a,b)->a.compareTo(b));

        ts.add("Z");
        ts.add("H");
        ts.add("A");
        ts.add("K");
        ts.add("E");

        System.out.println(ts);

    }
}
