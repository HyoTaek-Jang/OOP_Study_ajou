package Ver01byTaek;

public class PhoneInfo {
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name2, String phoneNumber2, String birth2) {
		name=name2;
		phoneNumber = phoneNumber2;
		birth = birth2;
	}

	public void showPhoneInfo() {
		System.out.println("사용자의 이름 : "+name+", 휴대폰번호 : "+phoneNumber+", 생년월일 : "+birth+"입니다.");
	}
}
