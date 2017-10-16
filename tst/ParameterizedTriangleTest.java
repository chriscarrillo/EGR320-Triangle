import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedTriangleTest {
    private static final Object[] getLegalTriangles() {
        return $(
                $(1.0, 1.0, 1.0),
                $(13.0, 13.0, 26.0),
                $(2.0, 3.0, 5.0),
                $(7.0, 7.0, 7.0),
                $(41.2, 41.2, 82.4),
                $(7.0, 7.0, 14.0),
                $(230.0, 230.0, 230.0),
                $(12.0, 12.0, 24.0),
                $(4.0, 5.0, 10.0),
                $(21.0, 21.0, 42.0)
        );
    }

    private static final Object[] getBadTriangles() {
        return $(
                $(2.0, 3.0, 5.0),
                $(2.0, 2.0, 2.0),
                $(2.0, 2.0, 4.0)
        );
    }

    private static final Object[] getEquilateralTriangles() {
        return $(
                $(2.0, 2.0, 2.0),
                $(7.0, 7.0, 7.0),
                $(132, 132, 132)
        );
    }

    private static final Object[] getScaleneTriangles() {
        return $(
                $(1.0, 2.0, 3.0),
                $(4.0, 2.0, 6.0),
                $(7.0, 3.0, 11.0)
        );
    }

    @Test
    @Parameters(method = "getLegalTriangles")
    public void triangleExistsTest(double a, double b, double c) {
        Triangle tri = new Triangle(a, b, c);
        Assert.assertSame(Triangle.class, tri.getClass());
    }

    @Test
    @Parameters(method = "getBadTriangles")
    public void notATriangleTest(double a, double b, double c) {
        Triangle tri = new Triangle(a, b, c);
        Assert.assertFalse(tri.notATriangle());
    }

    @Test
    @Parameters(method = "getEquilateralTriangles")
    public void isEquilateralTest(double a, double b, double c) {
        Triangle tri = new Triangle(a, b, c);
        Assert.assertTrue(tri.isEquilateral());
    }

    @Test
    @Parameters(method = "getScaleneTriangles")
    public void isScaleneTest(double a, double b, double c) {
        Triangle tri = new Triangle(a, b, c);
        Assert.assertTrue(tri.isScalene());
    }
}
