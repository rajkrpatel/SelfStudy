package eight.stream.program;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapToStreamProgram {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1, "Raj");
        studentMap.put(2,"Rahul");
        studentMap.put(3,"Sameer");
        studentMap.put(4,"Anurag");

        entrySetStream(studentMap);
        System.out.println();
        keySetStream(studentMap);
        System.out.println();
        valueStream(studentMap);
        
        
    }

    private static void valueStream(HashMap<Integer, String> studentMap) {
        Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
        entries.stream().forEach(entry -> {
            System.out.print("Key " + entry.getKey() + " Value " + entry.getValue());
        });

    }

    private static void keySetStream(HashMap<Integer, String> studentMap) {
        Set<Integer> keys = studentMap.keySet();
        System.out.print("Keys : ");
        keys.stream().forEach(System.out::print);

    }

    private static void entrySetStream(HashMap<Integer, String> studentMap) {
        Collection<String> values = studentMap.values();
        values.forEach(System.out::print);

        System.out.print("values  : ");
        studentMap.values().stream().forEach(System.out::print);
    }
}
