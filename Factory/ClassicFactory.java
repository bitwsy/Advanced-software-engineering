package Factory;

/**
 * Created by lenovo on 2015/11/9.
 */
public class ClassicFactory extends Factory{
    public Garden createGarden(){
        return new ClassicGarden();
    }
}
