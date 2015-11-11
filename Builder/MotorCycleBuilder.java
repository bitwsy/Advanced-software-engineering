package Builder;

/**
 * Created by lenovo on 2015/11/9.
 */
public class MotorCycleBuilder extends VehicleBuilder {
    public MotorCycleBuilder(){
        vehicle = new Vehicle("Motorcycle");
    }

    @Override
    public void BuildFrame() {
        vehicle.frame = "MotorcycleFrame";
    }

    @Override
    public void BuildEngine() {
        vehicle.engine = "MotorcycleEngine";
    }

    @Override
    public void BuildWheels() {
        vehicle.wheels = "MotorcycleWheels";
    }

    @Override
    public void BuildDoors() {
        vehicle.doors = "MotorcycleDoors";
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
