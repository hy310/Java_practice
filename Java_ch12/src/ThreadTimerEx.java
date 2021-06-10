import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	JLabel timerLabel;    // Ÿ�̸� ���� ��µǴ� ���̺�
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	// ������ �ڵ�. run() �� �����ϸ� ������ ����
	public void run() {
		int n = 0;   // Ÿ�̸� ī��Ʈ ��
		while(true) {   // ���ѷ���
			timerLabel.setText(Integer.toString(n)); // JLabel ��Ʈ���̴� ���ڷ� �ް� ���ڷ� �ٲ��ֱ�
			n++;   // ī��Ʈ ����
			// �����带 ���� �ʸ� �۾� ���̻��̿� 1000 seconds(1��) ���� ���� �Ϸ��� ��
			// 1�ʸ��� count �ϱ� ���ؼ�
			try {
				Thread.sleep(1000); // sleep �� ������ ������ ��. try, catch �� ������!
			}
			catch (InterruptedException e) {
				return;
			}
		}
		
	}
}

// Thread �� ��ӹ޾� 1�� ���� Ÿ�̸� ������ �����
public class ThreadTimerEx extends JFrame {
	
	public ThreadTimerEx() {    // ������
		setTitle("������ 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(250, 150);
		setVisible(true);
		
		th.start();   // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
		// ������ ��ü�� run() �� ����ǰ� ��
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ThreadTimerEx();

	}

}
