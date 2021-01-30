package junit;

import org.junit.jupiter.api.Test;

public class MathUtils {
    @Test
    public int testAdd(int a, int b){
        return a+b;
    }

    public double computeCircleRadius(double radius){
        return Math.PI * radius * radius;
    }
    public double divide (int a, int b){
        return a/b;
    }
}
