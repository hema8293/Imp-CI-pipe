import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testHelloMessage() {
        String expected = "Hello, CI/CD Pipeline!";
        assertEquals(expected, "Hello, CI/CD Pipeline!");
    }

    @Test
    void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testStringLength() {
        assertEquals(11, "Hello World".length());
    }
}
