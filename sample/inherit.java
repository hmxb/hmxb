package sample;

public class inherit {
    public static void main(String[] args) {
        Parent pa = new Parent();
        pa.pMethod();

        Child ch = new Child();
        ch.pMethod();
        ch.func();

        Parent pcls = new Child();
        pcls.pMethod();
    }
}
class Parent{
    int number;
    String name;

    public void pMethod(){
        System.out.println("Parent pMethod()");
    }
}

class Child extends Parent{
    int age;
    double height;

    public void func(){
        number = 12;
        name = "홍길동";
        age = 24;
        height = 172.1;
        System.out.println(name + number);
    }
    public void pMethod(){
        System.out.println("Child에서 오버라이딩");
    }
}