package sample;

import java.util.Arrays;

public class function {
    public static void main(String[] args) {
        functionName();

        function1(123);       // 123 : argument = 실인수

        String s = function2();
        System.out.println("s = " + s);

        int arr[] = function3();
        System.out.println("arr[] = "+ Arrays.toString(arr));

        double d = function4(3);
        System.out.println("d = " + d);

        char c = charLowerCase('B');
        System.out.println(c);
    }

    static void functionName(){
        System.out.println("functionName() 호출");

    }
    static void function1(int n){     // n : parameter = 매개변수 = 가인수
        System.out.println("function1(int n) n = " + n);
    }

    static String function2(){
        String str = "하이";
        return str;
    }
    static int[] function3(){
        int[] num = {10, 20, 30};
        return num;
    }
    static double function4(int n){
        double r;
        r = (double)n/2;
        return n;
    }
    static char charLowerCase(char c){
        int n = (int)c;
        int r = n + 32;
        return (char)r;
    }
}
