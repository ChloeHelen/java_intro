public class Strings {
  public static void main(String[] args) {
    // declare the first name
    String first_name = "Chloe";
    // declare the second name
    String last_name = "Helen";
    // create your message
    // StringBuilder
    StringBuilder message1 = new StringBuilder()
    .append(first_name).append(" ").append(last_name);
    // stringFormatConcat
    String message2 = String.format("%s %s", first_name, last_name);
    // print your message!
    System.out.println(message1);
    System.out.println(message2);
  }
}

// String stringFormatConcat = String.format("%s %s! Welcome to the %s!", greeting, person, location);
