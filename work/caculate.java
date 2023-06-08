package work;
import java.util.Scanner;

public class caculate {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int mius(int a, int b) {
        int mius = a - b;
        return mius;
    }

    public static int mult(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static int div(int a, int b) {
        int div = a % b;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.print("첫번째 숫자를 입력 : ");
        num1 = sc.nextInt();
        System.out.print("사칙연산 : ");
        String operator = sc.next();
        System.out.print("두번째 숫자를 입력 : ");
        num2 = sc.nextInt();

        switch (operator) {
            case "+":
                System.out.println(add(num1, num2));
                break;
            case "-":
                System.out.println(mius(num1, num2));
                break;
            case "*":
                System.out.println(mult(num1, num2));
                break;
            case "%":
                if(num2 == 0){
                    System.out.println("0으로 나눌수 없습니다.");
                    break;
                }
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
        }

    }
}
