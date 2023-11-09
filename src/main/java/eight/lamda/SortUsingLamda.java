package eight.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortUsingLamda {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);

        Collections.sort(al, (a,b)-> (a<b)?-1:(a>b)?1:0);
        System.out.println(al);
    }
}
