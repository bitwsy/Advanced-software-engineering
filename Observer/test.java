package Observer;

/**
 * Created by lenovo on 2015/11/9.
 */
public class test {
    public static void main(String args[]){
        Button button = new Button();

        button.Attach(new StatusObserver(button));
        button.Attach(new CountObserver(button));

        button.switchbutton();
        button.Notify();

        button.switchbutton();
        button.Notify();

    }
}
