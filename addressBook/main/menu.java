package main;

import java.util.Scanner;

import dao.addressDao;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addressDao dao = new addressDao();

        // 메뉴
        while (true) {
            System.out.println("============= address book menu ============");
            System.out.println("1. add address");
            System.out.println("2. delete address");
            System.out.println("3. select address");
            System.out.println("4. update address");
            System.out.println("5. allDataPrint");
            System.out.println("6. exit");

            System.out.print("menu nunber >> ");
            int menuNumber = sc.nextInt();

            switch (menuNumber) {
                case 1:
                    dao.insert();
                    break;
                case 2:
                    dao.delete();
                    break;
                case 3:
                    dao.select();
                    break;
                case 4:
                    dao.update();
                    break;
                case 5:
                    dao.allDataPrint();
                    break;
                case 6:
                    dao.exit();
                    break;
            }
        }
    }
}