package Ver01byTaek;

import java.util.Scanner;

public class PhoneBookTest {
	static Scanner keyboard = new Scanner(System.in);

	static void readData() {
		// TODO Auto-generated method stub
		System.out.println("�̸��� �Է����ּ���");
		String name = keyboard.nextLine();
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		String phoneNumber = keyboard.nextLine();
		System.out.println("��������� �Է����ּ���");
		String birth = keyboard.nextLine();

		PhoneInfo info = new PhoneInfo(name, phoneNumber, birth);
		info.showPhoneInfo();
	}

	static void showMenu() {
		System.out.println("�޴�");
		System.out.println("1. ������ �б�");
		System.out.println("2. ���α׷� ����");
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
