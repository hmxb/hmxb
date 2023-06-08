package dao;
// Data Access Object

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import dto.addressDto;

public class addressDao {
    // 데이터를 편집하는 클래스

    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int COUNT = 100;
    // 주소를 저장할 100개의 instance
    public addressDto[] addressBook = new addressDto[COUNT];
    private int counter;

    public addressDao() {
        counter = 0;
        addressBook = new addressDto[COUNT];
    }

    public void insert() {
        System.out.println("데이터를 추가합니다.");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("전화번호 : ");
        String phone = sc.next();
        System.out.print("주소 : ");
        String address = "";
        try {
            address = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("메모 : ");
        String memo = "";
        try {
            memo = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        addressBook[counter] = new addressDto(name, age, phone, address, memo);
        counter++;
    }

    public void delete() { // 숫자는 0으로, 이름은 빈문자열로
        System.out.print("삭제할 데이터의 이름을 입력하세요 : ");
        String name = sc.next();

        boolean isDeleted = false;
        for (int i = 0; i < addressBook.length; i++) {
            if (addressBook[i] != null && addressBook[i].name.equals(name)) {
                addressBook[i] = null;
                isDeleted = true;
                break;
            }
        }
        if (isDeleted) {
            System.out.println("데이터가 삭제되었습니다.");
        } else {
            System.out.println("일치하는 데이터가 없습니다.");
        }
    }

    public void select() { // 이름으로 검색
        System.out.println("검색할 데이터의 이름을 입력하세요 : ");
        String name = sc.next();
        boolean isFound = false;
        for (int i = 0; i < addressBook.length; i++) {
            if (addressBook[i] != null && addressBook[i].name.equals(name)) {
                System.out.println(addressBook[i].toString());
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("데이터를 찾았습니다.");
        } else {
            System.out.println("일치하는 데이터가 없습니다.");
        }
    }

    public void update() { // 전화번호, 주소, 메모만 바뀌게
        System.out.print("수정할 데이터의 이름을 입력하세요 : ");
        String name = sc.next();
        boolean isUpdated = false;
        for (int i = 0; i < addressBook.length; i++) {
            if (addressBook[i] != null && addressBook[i].name.equals(name)) {
                System.out.print("전화번호 : ");
                addressBook[i].phone = sc.next();
                System.out.print("주소 : ");
                String address = "";
                try {
                    addressBook[i].address = br.readLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.print("메모 : ");
                String memo = "";
                try {
                    addressBook[i].memo = br.readLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                isUpdated = true;
                break;
            }
        }
        if (isUpdated) {
            System.out.println("데이터가 수정되었습니다.");
        } else {
            System.out.println("일치하는 데이터가 없습니다.");
        }
    }
    public void exit() {
        System.exit(0);
    }

    public void allDataPrint() { // 확인
        for (int i = 0; i < addressBook.length; i++) {
            if (addressBook[i] != null) {
                System.out.println(addressBook[i].toString());
            }
        }
    }


}
