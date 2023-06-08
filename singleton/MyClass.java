package singleton;

public class MyClass {
    private int number;

    public MyClass() {
        number = 222;

        SingletonClass sc = SingletonClass.getInstance();
        sc.number = number;
    }

    // public int getNumber() {
    // return number;
    // }
}
