package work;

import java.util.Scanner;

public class randomNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num;
        boolean playAgain = true;
        
        // System.out.println(randNum);

        while (playAgain) {
            boolean clear = false;
            int randNum = (int) (Math.random() * 100)+1;
            System.out.println("랜덤 숫자가 생성되었습니다. 숫자를 맞춰보세요 ~");
            int n = 0;
            while (n < 3) {
                System.out.print("입력 : ");
                Num = sc.nextInt();
                if (randNum > Num) {
                    System.out.println("업 !");
                } else if (randNum < Num) {
                    System.out.println("다운 !");
                } else {
                    System.out.println("정답입니다 ~~ ");
                    clear = true;
                    break;
                }
                n++;
            }
            if(clear){
                System.out.println("성공 !");
            }
            else{
                System.out.println("실패 ~");
            }
            System.out.println("게임을 다시 진행하시겠습니까 ?(Y/N)");
            String playAgainInput = sc.next();
            playAgain = playAgainInput.equalsIgnoreCase("Y");
        }
        System.out.println("게임을 종료합니다.");
        sc.close();
    }
}
