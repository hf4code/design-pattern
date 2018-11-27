package behavior.observer;

// 观察者基类 (抽象类)
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
