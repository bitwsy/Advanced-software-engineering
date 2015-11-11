package Factory;

/**
 * Created by lenovo on 2015/11/9.
 */
public class ClassicGarden extends Garden {
    public ClassicGarden(){
        this.parterre = new Tulip();
        this.center = new Figs();
        this.conner = new Boneset();
    }
    public void printSet(){
        System.out.println("µ‰—≈–Õ");
        super.printSet();
        System.out.println();
    }
}
