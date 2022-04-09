import java.util.ArrayList;

// (parameter1, parameter2) -> { code block }

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
            System.out.println("java exp");
        } 
    );
  }
}