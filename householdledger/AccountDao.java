package householdledger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AccountDao {
    private Scanner sc = new Scanner(System.in);

    public AccountDao() {
    }

    public void addAccount() {
        System.out.println("가계부를 입력합니다.");
        System.out.print("날짜(년.월.일) >> ");
        String date = sc.next();
        System.out.print("번호           >> ");
        int num = sc.nextInt();
        System.out.print("용도           >> ");
        String use = sc.next();
        System.out.print("수입 / 지출    >> ");
        String moneyInOut = sc.next();
        System.out.print("비용           >> ");
        int amount = sc.nextInt();
        System.out.print("내용           >> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String memo = "";
        try {
            memo = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Singleton s = Singleton.getInstance();
        s.accountList.add(new AccountDto(date, num, use, moneyInOut, amount, memo));
    }

    public void deleteAccount() {
        System.out.print("삭제할 날짜 >> ");
        String date = sc.next();
        System.out.print("삭제할 번호 >> ");
        int num = sc.nextInt();

        int index = searchAccount(date, num);
        if (index == -1) {
            System.out.println("<" + date + "의 정보나 " + num + "번의 정보가 없습니다.");
        } else {
            Singleton s = Singleton.getInstance();
            s.accountList.remove(index);
            System.out.println("<" + date + "의 " + num + "번의 정보를 삭제했습니다.");
        }
    }

    public void selectAccount() {
        System.out.print("검색할 날짜 >> ");
        String date = sc.next();
        System.out.print("검색할 번호 >> ");
        int num = sc.nextInt();

        Singleton s = Singleton.getInstance();

        List<AccountDto> findDateList = new ArrayList<AccountDto>();
        for (int i = 0; i < s.accountList.size(); i++) {
            AccountDto dto = s.accountList.get(i);
            if (date.equals(dto.getDate()) && num == dto.getNum()) {
                findDateList.add(dto);
            }
        }

        if (findDateList.isEmpty()) {
            System.out.println("<" + date + "의 정보나 " + num + "번의 정보가 없습니다.");
            return;
        }
        System.out.print("");

        System.out.println("<" + date + "의 가계부 정보>");
        for (int i = 0; i < findDateList.size(); i++) {
            AccountDto dto = findDateList.get(i);
            System.out.println(dto.toString());
        }
    }

    public void updateAccount() {
        System.out.print("수정할 날짜 >> ");
        String date = sc.next();
        System.out.print("수정할 번호 >> ");
        int num = sc.nextInt();

        int index = searchAccount(date, num);
        if (index == -1) {
            System.out.println("<" + date + "의 정보나 " + num + "번의 정보가 없습니다.");
            return;
        }
        System.out.print("용도           >> ");
        String use = sc.next();
        System.out.print("수입 / 지출    >> ");
        String moneyInOut = sc.next();
        System.out.print("비용           >> ");
        int amount = sc.nextInt();
        System.out.print("내용           >> ");
        String memo = sc.next();

        Singleton s = Singleton.getInstance();

        AccountDto dto = s.accountList.get(index);
        dto.setUse(use);
        dto.setMoneyInOut(moneyInOut);
        dto.setAmount(amount);
        dto.setMemo(memo);

        System.out.println("<" + date + "의 " + num + "번의 정보를 수정했습니다.");
    }

    public int searchAccount(String date, int num) {
        Singleton s = Singleton.getInstance();
        int index = -1;
        for (int i = 0; i < s.accountList.size(); i++) {
            AccountDto dto = s.accountList.get(i);
            if (date.equals(dto.getDate()) && num == dto.getNum()) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void printAccount() {
        Singleton s = Singleton.getInstance();
        if (s.accountList.isEmpty()) {
            System.out.println("데이터가 없습니다.");
            return;
        }
        for (int i = 0; i < s.accountList.size(); i++) {
            System.out.println(s.accountList.get(i).toString());
        }
    }

    public class MonthlySummary {
        private String yearMonth;
        private int totalMoneyOut;
        private int totalMoneyIn;

        public MonthlySummary(String yearMonth) {
            this.yearMonth = yearMonth;
        }

        public void addMoneyOut(int amount) {
            totalMoneyOut += amount;
        }

        public void addMoneyIn(int amount) {
            totalMoneyIn += amount;
        }

        public String getYearMonth() {
            return yearMonth;
        }

        public int getTotalMoneyOut() {
            return totalMoneyOut;
        }

        public int getTotalMoneyIn() {
            return totalMoneyIn;
        }
    }

    public void monthSummary() {
        Singleton s = Singleton.getInstance();

        Map<String, MonthlySummary> monthlySummaries = new HashMap<>();

        for (AccountDto dto : s.accountList) {
            String date = dto.getDate();
            int amount = dto.getAmount();
            String moneyInOut = dto.getMoneyInOut();

            String[] dateParts = date.split("\\.");
            if (dateParts.length >= 2) {
                String yearMonth = dateParts[0] + "." + dateParts[1];
                MonthlySummary monthlySummary = monthlySummaries.get(yearMonth);
                if (monthlySummary == null) {
                    monthlySummary = new MonthlySummary(yearMonth);
                    monthlySummaries.put(yearMonth, monthlySummary);
                }

                if (moneyInOut.equals("지출")) {
                    monthlySummary.addMoneyOut(amount);
                } else if (moneyInOut.equals("수입")) {
                    monthlySummary.addMoneyIn(amount);
                }
            }
        }

        System.out.println("<년월별 가계부 결산>");

        for (MonthlySummary summary : monthlySummaries.values()) {
            int moneyOut = summary.getTotalMoneyOut();
            int moneyIn = summary.getTotalMoneyIn();
            System.out.println(summary.getYearMonth() + " : 지출 >> " + moneyOut + "원,\t 수입 >> " + moneyIn + "원");
        }
    }

}
