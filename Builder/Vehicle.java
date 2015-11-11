package Builder;

/**
 * Created by lenovo on 2015/11/9.
 */
public class Vehicle {
    public String type;
    public String frame;
    public String engine;
    public String wheels;
    public String doors;

    public Vehicle(String type) {
        this.type = type;
    }
    public void Show(){
        System.out.println("Type:"+type);
        System.out.println("Frame:"+frame);
        System.out.println("Engine:"+engine);
        System.out.println("Wheels:"+wheels);
        System.out.println("Doors:"+doors);
    }
}
