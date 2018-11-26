package creational.prototype;

public class APP {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototypeInstance = new Prototype();
        Prototype cloneInstance = prototypeInstance.clone();

        prototypeInstance.change();

        System.out.println(prototypeInstance);
        System.out.println(prototypeInstance.getField());
        System.out.println(cloneInstance);
        System.out.println(cloneInstance.getField());
    }
}
