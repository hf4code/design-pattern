package structural.bridge.draw;

//桥梁模式中的"桥梁",它是一个接口，用于定义提供的接口方法
public interface DrawAPI {
    void draw(int radius, int x, int y);
}
