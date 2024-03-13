import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubtractorDiffblueTest
{
    /**
     * Method under test: {@link Subtractor#doSomething(int)}
     */
    @Test
    void testDoSomething()
    {
        // Arrange, Act and Assert
        assertEquals(251, (new Subtractor()).doSomething(1));
    }
}
