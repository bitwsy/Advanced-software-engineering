package Factory;

/**
 * Created by lenovo on 2015/11/9.
 */
public abstract class Garden {
    public Flower parterre;
    public Flower center;
    public Flower conner;

    public void printSet(){
        System.out.print("��̨��");
        parterre.printname();
        System.out.print("���ģ�");
        center.printname();
        System.out.print("ǽ�ǣ�");
        conner.printname();
    }
}
