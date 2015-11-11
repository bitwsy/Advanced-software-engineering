package Builder;

/**
 * Created by lenovo on 2015/11/9.
 */
public abstract class Shop {

    public static Vehicle construct(VehicleBuilder builder){
        builder.BuildDoors();
        builder.BuildEngine();
        builder.BuildFrame();
        builder.BuildWheels();

        return builder.getVehicle();
    }
}
