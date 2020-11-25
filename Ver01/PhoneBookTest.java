package Ver01;

import java.util.Scanner;

public class PhoneBookTest {
	static Scanner keyboard = new Scanner(System.in);
	
	
	public static void showMenu() {
		System.out.println("원하시는 메뉴를 선택하세요.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.println("선택: ");
	}
	
	
	public static void readData() {
		System.out.println("이름 : ");
		String name = keyboard.nextLine();
		
		System.out.println("전화번호 : ");
		String phone = keyboard.nextLine();
		
		System.out.println("생년월일 : ");
		String birth = keyboard.nextLine();
		
		PhoneInfo info 
		= new PhoneInfo(name, phone, birth);
		
		System.out.println("\n입력된 정보 출력");
		info.showPhoneInfo();
	}
	
	
	public static void main(String[] args) {
		
		int choice;
		while(true) {
			showMenu();
			
			choice = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(choice) {
			
			case 1:
				readData();
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				System.exit(1);
			}
		}
	}
}
