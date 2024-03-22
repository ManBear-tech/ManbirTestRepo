
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AdderDiffblueTest {
  /**
   * Method under test: {@link Adder#addSomething(int, int)}
   */
  @Test
  void testAddSomething() {
    // Arrange, Act and Assert
    assertEquals(25, (new Adder()).addSomething(10, 10));
    assertEquals(11, (new Adder()).addSomething(3, 3));
    assertEquals(17, (new Adder()).addSomething(2, 10));
    assertEquals(20, (new Adder()).addSomething(5, 10));
  }

  /**
   * Method under test: {@link Adder#addSomething(int, Subtractor)}
   */
  @Test
  void testAddSomething2() {
    // Arrange
    Adder adder = new Adder();

    // Act and Assert
    assertEquals(9, adder.addSomething(2, new Subtractor()));
  }

  /**
   * Method under test: {@link Adder#doNothing(int)}
   */
  @Test
  void testDoNothing() {
    // Arrange, Act and Assert
    assertEquals(2, (new Adder()).doNothing(1));
  }

  /**
   * Methods under test:
   * 
   * <ul>
   *   <li>{@link Adder#Adder()}
   *   <li>{@link Adder#setNum1(int)}
   *   <li>{@link Adder#setNum2(int)}
   *   <li>{@link Adder#setNum3(int)}
   *   <li>{@link Adder#getNum1()}
   *   <li>{@link Adder#getNum2()}
   *   <li>{@link Adder#getNum3()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange and Act
    Adder actualAdder = new Adder();
    actualAdder.setNum1(10);
    actualAdder.setNum2(10);
    actualAdder.setNum3(10);
    int actualNum1 = actualAdder.getNum1();
    int actualNum2 = actualAdder.getNum2();

    // Assert that nothing has changed
    assertEquals(10, actualNum1);
    assertEquals(10, actualNum2);
    assertEquals(10, actualAdder.getNum3());
  }

  /**
   * Method under test: {@link Adder#Adder(Subtractor, Multiplier)}
   */
  @Test
  void testNewAdder() {
    // Arrange
    Subtractor sub = new Subtractor();

    // Act and Assert
    assertEquals(260, (new Adder(sub, new Multiplier())).getNum1());
  }
}
