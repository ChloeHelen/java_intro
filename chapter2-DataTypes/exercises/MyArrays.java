import java.util.Arrays;
import java.util.ArrayList;
// can you remember how to set up your main function?
public class MyArrays {
  public static void main (String[] args) {

// declare an array of Strings and print it
  String[] arrayOfWords = new String[] {"Hello", "there", "Chloe"};
  System.out.println(Arrays.toString(arrayOfWords));
// declare an array of integers and print it
  int[] arrayOfInts = new int[] {1, 2, 3};
  System.out.println(Arrays.toString(arrayOfInts));
// declare an ArrayList of integers, add numbers to it, and then print it
  ArrayList al = new ArrayList();
  al.add("1");
  al.add("2");
  al.add(5);
  System.out.println(al);
  }
}
