import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.function.Consumer;
// (parameter1, parameter2) -> { code block }
import java.util.function.Function;

interface StringFunction {
    public String run(String str);
}

public class LambdaExpParam implements StringFunction {
    @Override
    public String run(String str) {
        // TODO Auto-generated method stub
        return str;
    }

    public void testLamdaExpParam() {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
