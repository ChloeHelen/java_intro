// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main (String[] args) {
    // find a way to read in user input
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    String user_number = scanner.nextLine();
    int user_integer = Integer.parseInt(user_number);
    // write a method that will check if a number is odd or even
    boolean isEven;
    if(user_integer % 2 == 0){
        isEven = true;
    }
    else
    {
    isEven = false;
    }
    // print the answer to the console
    if(isEven){
        String message = String.format("%s is an even number", user_integer);
        System.out.println(message);
    }
    else
    {
      String message = String.format("%s is an odd number", user_integer);
      System.out.println(message);
    }
  }
}
