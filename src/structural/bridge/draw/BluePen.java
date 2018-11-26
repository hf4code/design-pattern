package structural.bridge.draw;

public class BluePen implements DrawAPI {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("painting in blue pen, radius=" + radius + ",x=" + x + ",y=" + y);
    }
}
