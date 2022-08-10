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
}
