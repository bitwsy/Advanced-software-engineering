package Factory;

/**
 * Created by lenovo on 2015/11/9.
 */
public abstract class Garden {
    public Flower parterre;
    public Flower center;
    public Flower conner;

    public void printSet(){
        System.out.print("花台：");
        parterre.printname();
        System.out.print("中心：");
        center.printname();
        System.out.print("墙角：");
        conner.printname();
    }
}
