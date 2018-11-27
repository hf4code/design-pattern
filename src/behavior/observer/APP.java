package behavior.observer;

public class APP {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new Subject();

        // 定义观察者
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        // 模拟数据变更，这个时候，观察者们的 update 方法将会被调用
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
