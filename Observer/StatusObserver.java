package Observer;

/**
 * Created by lenovo on 2015/11/9.
 */
public class StatusObserver extends Observer {
    private String status;
    private Button object;

    public StatusObserver(Button object){
        this.object = object;
    }

    @Override
    public void update() {
        status = object.getstatus();
        System.out.println("°´Å¥×´Ì¬:"+status);
    }
}
