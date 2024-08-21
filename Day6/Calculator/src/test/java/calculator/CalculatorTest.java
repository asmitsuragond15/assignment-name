package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;
    @Test
    public void testPositiveSum() {
        int result = calculator.sum(10, 9);
        assertEquals(19, result, "10 + 9 should equal 19");
    }

    @Test
    public void testNegativeSum() {
        int result = calculator.sum(-10, -9);
        assertEquals(-19, result, "-10 + -9 should equal -19");
    }

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This runs once before all tests.");
    }

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("This runs before each test.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("This runs after each test.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This runs once after all tests.");
    }

    
}
