package Builder;

/**
 * Created by lenovo on 2015/11/9.
 */
public class ScooterBuilder extends VehicleBuilder{
    public ScooterBuilder(){
        vehicle = new Vehicle("Scooter");
    }

    @Override
    public void BuildFrame() {
        vehicle.frame = "ScooterFrame";
    }

    @Override
    public void BuildEngine() {
        vehicle.engine = "ScooterEngine";
    }

    @Override
    public void BuildWheels() {
        vehicle.wheels = "ScooterWheels";
    }

    @Override
    public void BuildDoors() {
        vehicle.doors = "ScooterDoors";
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
