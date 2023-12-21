package eight.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapSortExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Raj", 1, 50));
        students.add(new Student("Rahul", 2, 60));
        students.add(new Student("Nikhil", 3, 20));
        students.add(new Student("Anurag", 4, 90));
        students.add(new Student("Sameer", 1, 100));

        List<Integer> studentIds = students.stream().filter(s -> s.getAge() > 50)
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .map(Student::getAge)
                .collect(Collectors.toList());
        System.out.println(studentIds);
    }
}
