package Factory;

/**
 * Created by lenovo on 2015/11/9.
 */
public class test {
    public static void main(String args[]){
        Factory classicfactory = new ClassicFactory();
        Factory usefulfactory = new UsefulFactory();
        Factory lazyfactory  = new LazyFactory();
        Garden classic = classicfactory.createGarden();
        Garden useful = usefulfactory.createGarden();
        Garden lazy = lazyfactory.createGarden();

        classic.printSet();
        useful.printSet();
        lazy.printSet();
    }
}
