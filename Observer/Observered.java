package Observer;

import java.util.ArrayList;

/**
 * Created by lenovo on 2015/11/9.
 */
public abstract class Observered {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void Attach(Observer observer)
    {
        observers.add(observer);
    }

    public void Detach(Observer observer)
    {
        observers.remove(observer);
    }

    public void Notify()
    {
        for (Observer observer:observers)
        {
            observer.update();
        }
    }
}
