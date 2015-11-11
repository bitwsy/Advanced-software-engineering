package Builder;

/**
 * Created by lenovo on 2015/11/9.
 */
public abstract class VehicleBuilder{
    public Vehicle vehicle;

    public abstract void BuildFrame();
    public abstract void BuildEngine();
    public abstract void BuildWheels();
    public abstract void BuildDoors();
    public abstract Vehicle getVehicle();
}
