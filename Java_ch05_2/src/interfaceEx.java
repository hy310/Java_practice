
interface PhoneInterface{           // 인터페이스 선언
	final int TIMEOUT = 10000;      // 상수 필드 선언
	void sendCall();                // 추상 메소드
	void receiveCall();             // 추상 메소드
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {
	// 추상은 상속받거나 구현하려면 메서드 내용을 작성해주어야 한다.

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다");
	}  
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class interfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
