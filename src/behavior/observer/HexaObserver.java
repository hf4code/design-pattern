package behavior.observer;

public class HexaObserver extends Observer {

    // 在构造方法中进行订阅主题
    public HexaObserver(Subject subject) {
        this.subject = subject;
        // 通常在构造方法中将 this 发布出去的操作一定要小心
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String result = Integer.toHexString(subject.getState());
        System.out.println("订阅的数据发生变化，新的数据处理为16进制值为：" + result);
    }
}
