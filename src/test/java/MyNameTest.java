import org.testng.Assert;
import org.testng.annotations.Test;

public class MyNameTest extends ProgramTest {

    @Test
    public void testMyNameSuccess() {
        Assert.assertEquals(program.sayMyName("Gabe Newell", 3), "Name is Gabe Newell (3)");
    }

    @Test
    public void testMyNameValidationZeroAge() {
        Assert.assertEquals(program.sayMyName("Yegor Zinovyev", 0), "Name is Yegor Zinovyev (0)");
    }

    @Test
    public void testMyNameValidationNegativeAge() {
        Assert.assertThrows(IllegalStateException.class, () -> program.sayMyName("Yegor Zinovyev", -1));
    }

    @Test
    public void testMyNameValidationEmptyName() {
        Assert.assertThrows(IllegalStateException.class, () -> program.sayMyName("", 1));
    }

    @Test
    public void testMyNameValidationNullName() {
        Assert.assertThrows(IllegalStateException.class, () -> program.sayMyName(null, 1));
    }
}
