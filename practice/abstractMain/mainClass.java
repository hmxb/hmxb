package sample.abstractMain;

public class mainClass {
    public static void main(String[] args) {
        // abstractClass ac = new abstractClass();

        // 자식클래스에서 오버라이드해서 생성하는방법
        // myClass mycls = new myClass();
        // mycls.method();
        // mycls.abstractMethod();

        // 부모클래스명 인스턴스 = new 자식클랙스명();
        // 부모인스턴스로 생성하는 방법
        abstractClass ac = new myClass();
        ac.method();
        ac.abstractMethod();

        // 생성과 함께 추상메소드를 정의하는 방법
        abstractClass ac1 = new myClass(){
            public void abstractMethod(){
                System.out.println("ac1 abstractMethod");
            }          
        };
        ac1.method();
        ac1.abstractMethod();
    }
}
