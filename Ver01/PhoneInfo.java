package Ver01;

public class PhoneInfo {

	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name, String number, String birth) {
		this.name = name; 
		this.phoneNumber = number;
		this.birth = birth;
	}
	public PhoneInfo(String name, String num) {
		this.name = name;
		this.phoneNumber=num;
		this.birth = null;
	}
	
	public void showPhoneInfo() {
		System.out.println("Name: " + this.name );
		System.out.println("Phone: " + this.phoneNumber );
		
		if(birth!=null) System.out.println("Birth: " + this.birth );
		
		System.out.println(""); // 데이터 구분
	}
}
