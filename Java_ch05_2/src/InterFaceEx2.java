
interface PhoneInterface2{           // 인터페이스 선언
	final int TIMEOUT = 10000;      // 상수 필드 선언
	void sendCall();                // 추상 메소드
	void receiveCall();             // 추상 메소드
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class Calc {
	public int calculate(int x, int y) {
		return x+y;
	}
}

// 상속과 구현 모두 할 것인데, 순서가 중요
// 순서는 상속 먼저
class SmartPhone extends Calc implements PhoneInterface2 {
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
	
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

public class InterFaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		System.out.println("3과 5를 더하면 " + phone.calculate(3,5));
		phone.schedule();
	}
}
