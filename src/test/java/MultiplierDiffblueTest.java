
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MultiplierDiffblueTest {
  /**
   * Method under test: {@link Multiplier#doSomething(int)}
   */
  @Test
  void testDoSomething() {
    Multiplier multiplier = null;
        int something = 1;

        // Act
        int actualDoSomethingResult = multiplier.doSomething(something);
    assertEquals(1, (new Multiplier()).doSomething(1));
  }
}
