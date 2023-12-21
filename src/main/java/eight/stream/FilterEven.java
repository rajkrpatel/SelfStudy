package eight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Inserting elements to ArrayList class object
        // Custom input integer numbers
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);
        List<Integer> result = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(result);
    }
}
