
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MultiplierDiffblueTest {
  /**
   * Method under test: {@link Multiplier#doSomething(int)}
   */
  @Test
  void testDoSomething() {
    // Arrange, Act and Assert
    assertEquals(1, (new Multiplier()).doSomething(1));
  }
}
