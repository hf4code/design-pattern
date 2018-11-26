package structural.bridge.draw;

public class GreenPen implements DrawAPI {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("painting in green pen, radius=" + radius + ",x=" + x + ",y=" + y);
    }
}
