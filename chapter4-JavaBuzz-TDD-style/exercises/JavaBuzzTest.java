import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTest {

  @Test
  public void divisibleByThree() {
    int x = 3;
    boolean answer = JavaBuzz.divisibleByThree(x);
    assertEquals(answer, true);
  }

}
