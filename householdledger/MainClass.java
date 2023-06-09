package householdledger;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDao dao = new AccountDao();
        FileProc fp = new FileProc("accountBook");

        fp.read();

        while (true) {
            System.out.println("=======가계부========");
            System.out.println("|   1. 가계부 추가  |");
            System.out.println("|   2. 가계부 삭제  |");
            System.out.println("|   3. 가계부 조회  |");
            System.out.println("|   4. 가계부 수정  |");
            System.out.println("|   5. 가계부 출력  |");
            System.out.println("|   6. 년월별 결산  |");
            System.out.println("|   7. 가계부 저장  |");
            System.out.println("|   8. 가계부 종료  |");
            System.out.println("=====================");

            System.out.print("menu number >> ");
            int menuNumber = sc.nextInt();

            switch (menuNumber) {
                case 1:
                    dao.addAccount();
                    break;
                case 2:
                    dao.deleteAccount();
                    break;
                case 3:
                    dao.selectAccount();
                    break;
                case 4:
                    dao.updateAccount();
                    break;
                case 5:
                    dao.printAccount();
                    break;
                case 6:
                    dao.monthSummary();
                    break;
                case 7:
                    fp.write();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
