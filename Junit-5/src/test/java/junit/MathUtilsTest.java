package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.gen5.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void test(){
        MathUtils mathUtils = new MathUtils();
        int expected = 3;
        int actual = mathUtils.add(1,1);
        assertEquals(expected, actual);
    }
}
