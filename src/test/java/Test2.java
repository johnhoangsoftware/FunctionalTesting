import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/*
Phaan hoach tuong duong
 */

public class Test2 {
    @Test
    public void test1() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(0, -3);
        assertFalse(result);
    }

    @Test
    public void test2() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(6, 2);
        assertFalse(result);
    }

    @Test
    public void test3() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(2, 9);
        assertFalse(result);
    }

    @Test
    public void test4() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(4, 5);
        assertTrue(result);
    }
}
