package eight.lamda;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListToHashMap {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Apple");

        System.out.println(fruits);

        Map<String, Integer> collect = fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));



        System.out.println(collect);

    }
}
