package daoList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtoList.AddressDto;

// DAO(Data Access Object)
public class AddressDao {
	// 데이터를 편집하는 클래스
	
	// composition
	private Scanner sc = new Scanner(System.in);
	
	/*
	final int COUNT = 100;
	
	// 주소를 저장할 100개의 instance
	private AddressDto addressBook[] = new AddressDto[COUNT];
	private int counter; 
	*/
	private List<AddressDto> addressList = null;
	
	public AddressDao() {		
	//	counter = 0;
		
		addressList = new ArrayList<AddressDto>();
	}
	
	public void insert() {
		// TODO: insert()
		System.out.println("데이터를 추가합니다");
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("전화번호 = ");
		String phone = sc.next();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("주소 = ");
		String address = "";
		try {
			address = br.readLine();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		System.out.print("메모 = ");
		String memo = "";
		try {
			memo = br.readLine();
		} catch (IOException e) { e.printStackTrace(); }
		
	//	addressBook[counter] = new AddressDto(name, age, phone, address, memo);
	//	counter++;
					
		addressList.add(new AddressDto(name, age, phone, address, memo));		
	}
	
	public void delete() {	// 24 -> 0	"홍길동" -> ""
		// TODO: delete() 함수
		System.out.print("삭제할 지인의 이름 >> ");
		String name = sc.next();
		
		// 검색
		/*
		int index = -1;
		for (int i = 0; i < addressBook.length; i++) {
			if(addressBook[i] != null) {
				if( name.equals(addressBook[i].getName()) ) { 
					index = i;
					break;
				}
			}
		}
		*/
		int index = search(name);
		
		if(index == -1) {
			System.out.println("지인정보를 찾을 수 없습니다");
		}else {
			// 삭제
			/*
			addressBook[index].setName("");
			addressBook[index].setAge(0);
			addressBook[index].setPhone("");
			addressBook[index].setAddress("");
			addressBook[index].setMemo("");
			*/
			// addressBook[index] = null;
			addressList.remove(index);
			
			System.out.println("지인정보를 삭제했습니다");
		}
		
	}
	
	public void select() {	// 이름으로 검색
		System.out.print("검색할 지인의 이름 >> ");
		String name = sc.next();
		/*
		for (int i = 0; i < addressBook.length; i++) {
			if(addressBook[i] != null) {
				if( name.equals(addressBook[i].getName()) ) { 
					System.out.println(addressBook[i].toString());
				}
			}
		}
		*/
		
		List<AddressDto> findNameList = new ArrayList<AddressDto>();
		
		for (int i = 0; i < addressList.size(); i++) {
			AddressDto dto = addressList.get(i);
			if(name.equals(dto.getName())) {
				findNameList.add(dto);
			}
		}
		
		if(findNameList.size() == 0) {
			System.out.println("기입하신 사람은 찾을 수 없습니다");
			return;
		}		
		
		System.out.println("검색된 명단입니다 --- ");
		for (int i = 0; i < findNameList.size(); i++) {
			System.out.println(findNameList.get(i).toString());
		}			
	}
	
	public void update() {	
		System.out.print("수정할 지인의 이름 >> ");
		String name = sc.next();
		
		// 검색
		int index = search(name);
		if(index == -1) {
			System.out.println("지인의 정보를 찾을 수 없습니다");
			return;
		}
		
		// 수정
		System.out.print("전화번호 >> ");
		String phone = sc.next();
		
		System.out.print("주소 >> ");
		String address = sc.next();
		
		System.out.print("메모 >> ");
		String memo = sc.next();
		
	//	addressBook[index].setPhone(phone);
	//	addressBook[index].setAddress(address);
	//	addressBook[index].setMemo(memo);
		
//		addressList.get(index).setPhone(phone);
//		addressList.get(index).setAddress(address);
//		addressList.get(index).setMemo(memo);
		
		AddressDto dto = addressList.get(index);
		dto.setPhone(phone);
		dto.setAddress(address);
		dto.setMemo(memo);
		
		System.out.println("수정을 완료했습니다");
	}
	
	public int search(String name) {
		/*
		int index = -1;
		for (int i = 0; i < addressBook.length; i++) {
			if(addressBook[i] != null) {
				if( name.equals(addressBook[i].getName()) ) { 
					index = i;
					break;
				}
			}
		}
		*/
		
		int index = -1;
		for (int i = 0; i < addressList.size(); i++) {
			AddressDto dto = addressList.get(i);
			if(name.equals(dto.getName())) {
				index = i;
				break;
			}
		}		
		return index;
	}
	
	// 확인
	public void allDataPrint() {
		// TODO: allDataPrint
		/*
		if(addressBook.length == 0) {
			System.out.println("데이터 없습니다");
			return;
		}		
		
		for (int i = 0; i < addressBook.length; i++) {
			if(addressBook[i] != null 
					&& addressBook[i].getName().equals("") == false) {
				
				System.out.println(addressBook[i].toString());
			}
		}*/
		
		if(addressList.isEmpty()) {	// addressList.size() == 0
			System.out.println("데이터 없습니다");
			return;
		}
		
		for (int i = 0; i < addressList.size(); i++) {
			System.out.println(addressList.get(i).toString());
		}
		
	}
}










