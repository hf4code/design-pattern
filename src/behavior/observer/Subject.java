package behavior.observer;

import java.util.ArrayList;
import java.util.List;

// 主题,需要持有观察者列表的引用，用于在数据变更的时候通知各个观察者
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 数据已变更，通知观察者们
        notifyAllObservers();
    }

    // 通知观察者们
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }
}
