package Ver01;

import java.util.Scanner;

public class PhoneBookTest {
	static Scanner keyboard = new Scanner(System.in);
	
	
	public static void showMenu() {
		System.out.println("���Ͻô� �޴��� �����ϼ���.");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.println("����: ");
	}
	
	
	public static void readData() {
		System.out.println("�̸� : ");
		String name = keyboard.nextLine();
		
		System.out.println("��ȭ��ȣ : ");
		String phone = keyboard.nextLine();
		
		System.out.println("������� : ");
		String birth = keyboard.nextLine();
		
		PhoneInfo info 
		= new PhoneInfo(name, phone, birth);
		
		System.out.println("\n�Էµ� ���� ���");
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
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(1);
			}
		}
	}
}
