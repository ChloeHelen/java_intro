import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTest {

  @Test
  public void divisibleByThree() {
    boolean answer = JavaBuzz.divisibleByThree(3);
    assertEquals(answer, true);
  }

  @Test
  public void divisibleByFive() {
    boolean answer = JavaBuzz.divisibleByFive(5);
    assertEquals(answer, true);
  }

  @Test
  public void divisibleByFifteen() {
    boolean answer = JavaBuzz.divisibleByFifteen(15);
    assertEquals(answer, true);
  }


}
