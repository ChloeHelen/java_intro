// what imports will you need?
import java.util.Scanner;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main (String[] args) {
    int user_integer = getUserInput();
    boolean isEven = evenCheck(user_integer);
    message(isEven);
  }

  public static int getUserInput() {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    String user_number = scanner.nextLine();
    int user_integer = Integer.parseInt(user_number);
    return user_integer;
}

  public static boolean evenCheck(int user_integer) {
    boolean isEven;
    if(user_integer % 2 == 0){
      isEven = true;
    }
    else
    {
      isEven = false;
    }
    return isEven;
  }

  public static void message(boolean isEven) {
    if(isEven){
      System.out.println("That's an even number");
    }
    else
    {
      System.out.println("That's an odd number");
    }
  }
}
