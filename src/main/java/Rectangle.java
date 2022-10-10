public class Rectangle {
    public static final double MIN_X = 1;
    public static final double MAX_X = 5;
    public static final double MIN_Y = -2;
    public static final double MAX_Y = 7;
    public boolean isBelongRectangle(double x, double y) {
        if (x >= MIN_X && x <= MAX_X) {
            if (y >= MIN_Y && y <= MAX_Y) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
