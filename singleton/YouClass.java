package singleton;

public class YouClass {
    private int number;
    private String name;

    public YouClass(){
        name = "김현민!!";

        SingletonClass sc = SingletonClass.getInstance();
        sc.name = name;
    }

    // public void setNumber(int number) {
    // this.number = number;
    // }

    public void info() {
        SingletonClass sc = SingletonClass.getInstance();
        number = sc.number;
        System.out.println("YouClass number : " + number);
    }
}
