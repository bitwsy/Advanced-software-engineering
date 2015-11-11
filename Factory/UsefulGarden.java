package Factory;

/**
 * Created by lenovo on 2015/11/9.
 */
public class UsefulGarden extends Garden {
    public UsefulGarden(){
        this.parterre = new Grapes();
        this.center = new Punica();
        this.conner = new Luffa();
    }
    public void printSet(){
        System.out.println(" µ”√–Õ");
        super.printSet();
        System.out.println();
    }
}
