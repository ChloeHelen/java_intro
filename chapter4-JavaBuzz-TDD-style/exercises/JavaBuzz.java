import java.util.Scanner;
// can you remember how to set up your main function?
public class JavaBuzz {
  public static void main (String[] args) {
    // int number = getUserInput();
    // if (divisibleByFifteen(number)) {
    //   System.out.println("JavaBuzz");
    // }
    // else if (divisibleByThree(number)) {
    //   System.out.println("Java");
    // }
    // else if (divisibleByFive(number)) {
    //   System.out.println("Buzz");
    // }
  }
// "Java" if divisible by 3
  public static boolean divisibleByThree(int num) {
    boolean isDivisibleByThree;
    if (num % 3 == 0) {
      isDivisibleByThree = true;
    }
    else
    {
      isDivisibleByThree = false;
    }
    return isDivisibleByThree;
  }
//
//   public static boolean divisibleByFive(int num) {
//     boolean isDivisibleByFive;
//     if (num % 5 == 0) {
//       isDivisibleByFive = true;
//     }
//     else
//     {
//       isDivisibleByFive = false;
//     }
//     return isDivisibleByFive;
//   }
//
//   public static boolean divisibleByFifteen(int num) {
//     boolean isDivisibleByFifteen;
//     if (num % 15 == 0) {
//       isDivisibleByFifteen = true;
//     }
//     else
//     {
//       isDivisibleByFifteen = false;
//     }
//     return isDivisibleByFifteen;
//   }
//
//   public static int getUserInput() {
//     System.out.println("Enter a number: ");
//     Scanner scanner = new Scanner(System.in);
//     String user_number = scanner.nextLine();
//     int user_integer = Integer.parseInt(user_number);
//     return user_integer;
// }
}
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
