package Observer;

/**
 * Created by lenovo on 2015/11/9.
 */
public class Button extends Observered {
    private String status;
    public Button(){
        this.status = "closed";
    }
    public void switchbutton(){
        if(status.equals("closed")) {
            status = "open";
        }
        else if(status.equals("open")) {
            status = "closed";
        }
    }
    public String getstatus(){
        return status;
    }
}
