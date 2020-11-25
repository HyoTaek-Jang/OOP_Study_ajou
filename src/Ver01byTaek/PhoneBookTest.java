package Ver01byTaek;

import java.util.Scanner;

public class PhoneBookTest {
	static Scanner keyboard = new Scanner(System.in);

	static void readData() {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력해주세요");
		String name = keyboard.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phoneNumber = keyboard.nextLine();
		System.out.println("생년월일을 입력해주세요");
		String birth = keyboard.nextLine();

		PhoneInfo info = new PhoneInfo(name, phoneNumber, birth);
		info.showPhoneInfo();
	}

	static void showMenu() {
		System.out.println("메뉴");
		System.out.println("1. 데이터 읽기");
		System.out.println("2. 프로그램 종료");
	}
	
	public static void main(String[] args) {

		int choice;
		while (true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();

			switch (choice) {
			case 1:
				readData();
				break;
			case 2:
				System.exit(1);
			}
		}

	}
}
