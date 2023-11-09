package eight;

public interface FuncInterface {

    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
