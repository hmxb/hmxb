package work;

import java.text.DecimalFormat;
import java.util.Scanner;

public class basballClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        baseballTeam[] giants = new baseballTeam[5];
        for (int i = 0; i < giants.length; i++) {
            giants[i] = new baseballTeam();
            giants[i].inputData();

            System.out.println("=========등록한 선수 정보 출력========");
            System.out.println(giants[i].printPlayer());
        }
    }
}

class baseballTeam {
    private int chooseWho;
    private int number;
    private String name;
    private double height;
    private pitcher p;
    private hitter h;
    private Scanner sc;

    public void inputData() {
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("투수 등록 = 1번 / 타자 등록 = 2번");
            chooseWho = sc.nextInt();
            if (chooseWho == 1 || chooseWho == 2) {
                break;
            } else {
                System.out.println("1 또는 2를 입력해주세요.");
            }
        }
        System.out.println("번호 : ");
        number = sc.nextInt();
        System.out.println("이름 : ");
        name = sc.next();
        System.out.println("키 : ");
        height = sc.nextDouble();

        if (chooseWho == 1) {
            p = new pitcher();
            p.inputPitchertData();
        } else if (chooseWho == 2) {
            h = new hitter();
            h.inputHitterData();
        }
    }

    public String printPlayer() {
        DecimalFormat df = new DecimalFormat("#0.00");
        String playerInfo = "번호: " + number + ", 이름: " + name + ", 신장: " + height;
        if (p != null) {
            playerInfo += ", 승: " + p.getWin() + ", 패: " + p.getLose() + ", ERA(방어율): " + df.format(p.getERA()) + "%";
        } else if (h != null) {
            playerInfo += ", 히트: " + h.getHit() + ", 타수: " + h.getHitNum() + ", BA(타율): " +df.format(h.getBA()) + "%";
        }
        return playerInfo;
    }
}

class pitcher extends baseballTeam {
    private int win; // 승
    private int lose; // 패
    private double ERA; // 방어율
    private Scanner sc;

    public void inputPitchertData() {
        sc = new Scanner(System.in);
        System.out.println("win : ");
        win = sc.nextInt();
        System.out.println("lose : ");
        lose = sc.nextInt();
        ERA = ((double) win / (win + lose)) * 100;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public double getERA() {
        return ERA;
    }
}

class hitter extends baseballTeam {
    private int hit; // 타수
    private int hitNum; // 히트수
    private double BA; // 타율
    private Scanner sc;

    public void inputHitterData() {
        sc = new Scanner(System.in);
        System.out.println("hit : ");
        hit = sc.nextInt();
        System.out.println("hitNum : ");
        hitNum = sc.nextInt();
        BA = ((double) hitNum / hit) * 100;
    }

    public int getHit() {
        return hit;
    }

    public int getHitNum() {
        return hitNum;
    }

    public double getBA() {
        return BA;
    }
}
