
interface PhoneInterface{           // �������̽� ����
	final int TIMEOUT = 10000;      // ��� �ʵ� ����
	void sendCall();                // �߻� �޼ҵ�
	void receiveCall();             // �߻� �޼ҵ�
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {
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