import org.testng.Assert;
import org.testng.annotations.Test;


public class DivisionTest extends ProgramTest {
    @Test
    public void testDivideIntegerSuccess() {
        Assert.assertEquals(program.divide(42, 2), 21.0);
    }

    @Test
    public void testDivideFloatingSuccess() {
        Assert.assertEquals(program.divide(25, 2), 12.5);
    }

    @Test
    public void testDivideNegativeSuccess() {
        Assert.assertEquals(program.divide(20, -5), -4.0);
    }

    @Test
    public void testDivideByZero() {
        Assert.assertThrows(ArithmeticException.class, () -> program.divide(100, 0));
    }
}
