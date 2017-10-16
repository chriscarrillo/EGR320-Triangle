import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void triangleExistsTest() {
        Triangle tri = new Triangle(2,3,5);
        Assert.assertSame(Triangle.class, tri.getClass());
    }

    @Test
    public void notATriangleTest() {
        Triangle tri = new Triangle(132, 0, 3);
        Assert.assertTrue(tri.notATriangle());
    }

    @Test
    public void isEquilateralTest() {
        Triangle tri = new Triangle(7,7,7);
        Assert.assertTrue(tri.isEquilateral());
    }

    @Test
    public void isScaleneTest() {
        Triangle tri = new Triangle(1, 2, 3);
        Assert.assertTrue(tri.isScalene());
    }
}
