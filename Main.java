import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.function.Consumer;
// (parameter1, parameter2) -> { code block }
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach(
                (n) -> {
                    System.out.println(n);
                });

        Consumer<Integer> methodNum = (n) -> {
            System.out.println(n);
        };

        numbers.forEach(methodNum);

        LambdaExpParam lamExp = new LambdaExpParam();
        lamExp.testLamdaExpParam();

    }

}