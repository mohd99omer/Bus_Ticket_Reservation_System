import java.util.function.Consumer;

public class LambdaE {
    public static void main(String[] args) {

        Consumer<Integer> p = n -> System.out.println(n);

        p.accept(5);

    }
}
