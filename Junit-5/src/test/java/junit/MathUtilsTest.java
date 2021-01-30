package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertThrows;

public class MathUtilsTest {
    @Test
    void test(){
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.testAdd(1,1);
        assertEquals(expected, actual, "Add method should add two numbers");
    }
    @Test
    void testComputeCircleRadius(){
        MathUtils mathUtils = new MathUtils();
        double radius = 10.0;
        assertEquals((Math.PI * radius * radius), mathUtils.computeCircleRadius(radius), "computeCirculeRadius should calculate the radius of a circle");
    }

    @Test
    void testDivide(){
        final MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0));
    }
}
