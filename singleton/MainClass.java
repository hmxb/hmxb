package singleton;
import singleton.MyClass;
import singleton.YouClass;
import singleton.SingletonClass;
public class MainClass {
    public static void main(String[] args) {
        MyClass mycls = new MyClass();
        YouClass youcls = new YouClass();
        HeClass hecls = new HeClass();

        // int num = mycls.getNumber();
        // youcls.setNumber(num);

        youcls.info();
        hecls.func();
        
    }
    
}
