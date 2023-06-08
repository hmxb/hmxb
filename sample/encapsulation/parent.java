package sample.encapsulation;

public class parent {
    protected int number;
    private String name; // 자식에서 접근 불가
    protected int age; // 자식에서 접근 가능

    public void method() {
        number = 12;
        name = "홍길동";
    }

    public static void main(String[] args) {

    }
}

class child extends parent {
    public void func() {
        number = 12;
        age = 22;
        // name = "아무나";
        }
}
