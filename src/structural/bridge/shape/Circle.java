package structural.bridge.shape;

import structural.bridge.draw.DrawAPI;

//just a circle
public class Circle extends Shape {
    private int radius;

    public Circle(DrawAPI drawAPI, int radius) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
}
