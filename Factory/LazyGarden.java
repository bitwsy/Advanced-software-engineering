package Factory;

/**
 * Created by lenovo on 2015/11/9.
 */
public class LazyGarden extends Garden {
    public LazyGarden(){
        this.parterre = new Yueji();
        this.center = new Tea();
        this.conner = new Bambu();
    }
    public void printSet(){
        System.out.println("¿¡∂Ë–Õ");
        super.printSet();
        System.out.println();
    }
}
