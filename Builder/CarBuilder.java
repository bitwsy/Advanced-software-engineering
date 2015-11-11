package Builder;

/**
 * Created by lenovo on 2015/11/9.
 */
public class CarBuilder extends VehicleBuilder{
    public CarBuilder(){
        vehicle = new Vehicle("Car");
    }

    @Override
    public void BuildFrame() {
        vehicle.frame = "CarFrame";
    }

    @Override
    public void BuildEngine() {
        vehicle.engine = "CarEngine";
    }

    @Override
    public void BuildWheels() {
        vehicle.wheels = "CarWheels";
    }

    @Override
    public void BuildDoors() {
        vehicle.doors = "CarDoors";
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
