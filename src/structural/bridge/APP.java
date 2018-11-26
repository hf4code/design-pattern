package structural.bridge;

import structural.bridge.draw.GreenPen;
import structural.bridge.draw.RedPen;
import structural.bridge.shape.Circle;
import structural.bridge.shape.Rectangle;
import structural.bridge.shape.Shape;

public class APP {
    public static void main(String[] args) {
        Shape greenCircle = new Circle(new GreenPen(), 10);
        Shape redRectangle = new Rectangle(new RedPen(), 4, 8);

        greenCircle.draw();
        redRectangle.draw();
    }
}
