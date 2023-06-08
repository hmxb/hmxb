package work;

import java.util.Scanner;

public class translate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * 변환 프로그램
         * 10진수, 2진수, 16진수
         */

        while (true) {
            System.out.println("변환 프로그램 ----------------");
            System.out.println("1.10진수를 2진수로 변환");
            System.out.println("2.10진수를 16진수로 변환");
            System.out.println("3.2진수를 10진수로 변환");
            System.out.println("4.16진수를 10진수로 변환");
            System.out.println("5.종료");

            System.out.println();

            // 메뉴번호 입력
            System.out.print("메뉴번호 >> ");
            String input = sc.next();
            int menuNum;
            try {
                menuNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
                System.out.println();
                continue;
            }

            if (menuNum == 5) {
                System.out.println("프로그램을 종료합니다a.");
                break;
            }
            
            if (menuNum < 1 || menuNum > 5) {
                System.out.println("메뉴 번호가 잘못됐습니다. 다시 입력하세요");
                continue;
            }
            

            // 변환할 숫자
            System.out.print("변환할 숫자 >> ");
            String strNum = sc.next();

            switch (menuNum) {
                case 1: // 10진수 -> 2진수
                    int num10to2 = Integer.parseInt(strNum); // 문자열 -> 숫자
                    String result = Integer.toBinaryString(num10to2); // 10진수 -> 2진수
                    System.out.println("결과 : " + result);
                    System.out.println();
                    break;
                case 2: // 10진수 -> 16진수
                    int num10to16 = Integer.parseInt(strNum);
                    result = Integer.toHexString(num10to16);
                    System.out.println("결과 : " + result);
                    System.out.println();
                    break;
                case 3: // 2진수 -> 10진수
                    int num2to10 = Integer.parseInt(strNum, 2);
                    System.out.println("결과 : " + num2to10);
                    System.out.println();
                    break;
                case 4: // 16진수 -> 10진수
                    int num16to10 = Integer.parseInt(strNum, 16);
                    System.out.println("결과 : " + num16to10);
                    System.out.println();
                    break;
                default:
            }

        }
    }
}
