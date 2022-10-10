import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
kiem thu gia tri bien
 */

public class Test1 {
    private static final double NOM_X = (Rectangle.MIN_X + Rectangle.MAX_X) / 2;
    private static final double NOM_Y = (Rectangle.MIN_Y + Rectangle.MAX_Y) / 2;
    
    @Test
    public void test1() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(NOM_X, NOM_Y);
        assertTrue(result);
    }

    @Test
    public void test2() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(Rectangle.MIN_X, NOM_Y);
        assertFalse(result);
    }

    @Test
    public void test3() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(Rectangle.MIN_X + 0.01, NOM_Y);
        assertFalse(result);
    }

    @Test
    public void test4() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(Rectangle.MAX_X - 0.01, NOM_Y);
        assertFalse(result);
    }

    @Test
    public void test5() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(Rectangle.MAX_X, NOM_Y);
        assertFalse(result);
    }

    @Test
    public void test6() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(NOM_X, Rectangle.MIN_Y);
        assertFalse(result);
    }

    @Test
    public void test7() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(NOM_X, Rectangle.MIN_Y + 0.01);
        assertFalse(result);
    }

    @Test
    public void test8() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(NOM_X, Rectangle.MAX_Y - 0.01);
        assertFalse(result);
    }

    @Test
    public void test9() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(NOM_X, Rectangle.MAX_Y);
        assertFalse(result);
    }

}
