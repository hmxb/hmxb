package work;

import java.util.Scanner;

public class sandGame {
    private int sand;

    public sandGame() {
        sand = (int) (Math.random() * 70) + 30; // 모래를 30~100으로 설정
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);
        int n;
        int result = sand;
        while (result > 0) {
            System.out.println("모래 크기: " + result);
            System.out.println("모래를 얼마나 퍼시겠습니까? (1~15)");
            n = sc.nextInt();
            result -= n;
            if (result <= 0) {
                System.out.println("모래가 무너졌습니다.");
                break;
            }
        }
        System.out.println("게임이 끝났습니다.");
    }

    public static void main(String[] args) {
        sandGame game = new sandGame();
        game.playGame();
    }
}
