package creational.prototype;

public class Prototype implements Cloneable {

    private int x;
    private int y;
    private Field field;

    public Prototype(){
        this.x = 2;
        this.y = 3;
        this.field = new Field();
    }

    public void change(){
        this.x = 88;
        this.y = 66;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Object object;

        object = super.clone();
        return (Prototype)object;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Field getField() {
        return field;
    }
}
