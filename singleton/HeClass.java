package singleton;

public class HeClass {
    private String name;

    public void func(){
        SingletonClass sc = SingletonClass.getInstance();
        name = sc.name;
        System.out.println("HeCalass name : " + name);
    }
}
