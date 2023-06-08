package singleton;

public class SingletonClass {
    private static SingletonClass sc = null;
    public int number;
    public String name;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (sc == null) {
            sc = new SingletonClass();
        }
        return sc;
    }
}
