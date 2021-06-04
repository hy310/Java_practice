
interface PhoneInterface2{           // �������̽� ����
	final int TIMEOUT = 10000;      // ��� �ʵ� ����
	void sendCall();                // �߻� �޼ҵ�
	void receiveCall();             // �߻� �޼ҵ�
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class Calc {
	public int calculate(int x, int y) {
		return x+y;
	}
}

// ��Ӱ� ���� ��� �� ���ε�, ������ �߿�
// ������ ��� ����
class SmartPhone extends Calc implements PhoneInterface2 {
	// �߻��� ��ӹްų� �����Ϸ��� �޼��� ������ �ۼ����־�� �Ѵ�.

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("�츮����");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Խ��ϴ�");
	}  
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
	public void schedule() {
		System.out.println("���� �����մϴ�.");
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
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3,5));
		phone.schedule();
	}
}
