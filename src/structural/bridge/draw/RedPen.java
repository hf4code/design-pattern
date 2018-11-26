package structural.bridge.draw;

public class RedPen implements DrawAPI {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("painting in red pen, radius=" + radius + ",x=" + x + ",y=" + y);
    }
}
