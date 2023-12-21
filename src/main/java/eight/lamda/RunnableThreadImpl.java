package eight.lamda;

import java.util.Comparator;

public class RunnableThreadImpl {
    public static void main(String[] args) {
        Runnable run = () -> {
            System.out.println("Runnable method called");
        };

        Thread t = new Thread(run);
        t.start();
    }
}
