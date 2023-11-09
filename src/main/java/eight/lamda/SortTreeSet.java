package eight.lamda;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class SortTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>((o1, o2) -> (o1 > o2) ?
                -1 : (o1 < o2) ? 1 : 0);

        treeSet.add(40);
        treeSet.add(3);
        treeSet.add(50);
        treeSet.add(30);

        System.out.println(treeSet);
    }
}
