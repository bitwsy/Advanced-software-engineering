package Observer;

/**
 * Created by lenovo on 2015/11/9.
 */
public class CountObserver extends Observer{
    private int count;
    private Button object;

    public CountObserver(Button object){
        this.object = object;
        count = 0;
    }

    @Override
    public void update() {
        count ++;
        System.out.println("按下次数:"+count);
    }
}
