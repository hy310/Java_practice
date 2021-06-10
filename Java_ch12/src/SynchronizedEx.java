// �� �����尡 ���� ������ ��ü�� ���� ���ÿ� ����ϴ� ���
// ����ȭ - synchronized ��� ����

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();    // ���� ������ (���� ������) ����
		String [] engText = { "Wise men say, ", "only fools rush in", 
				"But I can't help, ", "falling in love with you", 
				"Shall I stay? ", "Would it be a sin?", 
				"if I can't help, ", "falling in love with you" };
		String [] korText = { "���ع��� ��λ��� ������ �⵵��, ", "�ϴ����� �����ϻ� �츮 ���� ����", 
				"����ȭ ��õ�� ȭ������, ", "���� ��� �������� ���� �����ϼ�",
				"���� ���� �� �ҳ���, ö���� �θ� ��", "�ٶ����� �Һ����� �츮 ����ϼ�.",
				"����ȭ ��õ�� ȭ������, ", "���� ��� �������� ���� �����ϼ�" };
		Thread th1 = new WorkerThread(p, engText); // ������� ������
		Thread th2 = new WorkerThread(p, korText); // ������� ������
		
		// �� ������ �����Ű��
		th1.start();
		th2.start();
	}
}

// �� WorkerThread �����忡 ���� ���� ���ٵǴ� ���� ������
// ������ Ŭ������ ���ư� �� ��
class SharedPrinter{
	// synchronized �����ϸ� �ѱ۰� ��� �� �ٿ� ���� ��µǴ� ��� �߻�
	synchronized void print(String text) {
		for (int i=0; i<text.length(); i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}

// ������ Ŭ����
class WorkerThread extends Thread {
	SharedPrinter p;   // ���� ������ �ּ�
	String [] text;
	
	// �޼��� �ϳ��� ����� �Ŷ� �����ڷ� ���
	// �����Ϳ� ����� �迭 �ޱ�
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}
	
	// ������� �ݺ������� ���� �����Ϳ� ���� text[] ���
	public void run() {
		for(int i=0; i<text.length; i++)  // �� �پ� ���
			p.print(text[i]);             // ���� �����Ϳ� ���
	}
}