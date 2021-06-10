import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {

	JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	// ������ �ڵ�. run() �� �����ϸ� ������ ����
	public void run() {
		int n=0;   // Ÿ�̸� ī��Ʈ ��
		while(true) {    // ���� ����
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);   // 1�� ���� �� �ܴ�
			}
			catch (InterruptedException e) {
				return;
			}
		}
	}	
}

public class RunnableTimerEx extends JFrame {
	
	public RunnableTimerEx() {
		setTitle("������ 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);   // ������ ��ü ����
		// runnable �ȿ� thread �� ����ֱ� ������ ���� �����ָ� ��
		
		setSize(250, 150);
		setVisible(true);	
		
		th.start();  // Ÿ�̸� �����尡 run() �� ���� ������ �����ϰ� �Ѵ�.
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
	}
}
