package eight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        // Creating an integer Arraylist to store marks
        ArrayList<Integer> marks = new ArrayList<Integer>();

        // These are marks of the students
        // Considering 5 students so input entries
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);

        // Now we want to grace marks by 6
        List<Integer> gracedMarks = marks.stream().map(i -> i + 6).collect(Collectors.toList());
        System.out.println(gracedMarks);
    }
}
