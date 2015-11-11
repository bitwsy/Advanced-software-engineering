package Builder;

/**
 * Created by lenovo on 2015/11/9.
 */
public class test {
    public static void main(String args[]){
        Vehicle car = Shop.construct(new CarBuilder());
        car.Show();
        System.out.println();
        Vehicle scooter = Shop.construct(new ScooterBuilder());
        scooter.Show();
        System.out.println();
        Vehicle motorcycle = Shop.construct(new MotorCycleBuilder());
        motorcycle.Show();
    }
}
