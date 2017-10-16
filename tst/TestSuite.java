import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TriangleTest.class,
        ParameterizedTriangleTest.class
})
public class TestSuite {
}
