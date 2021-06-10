import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


// wait, notify �� �̿��� �� ä��� �������α׷�
// �����带 ���� bar �� �ƹ�Ű�� ������ �� ä�������ϰ�, ������ ������ �� ���ҽ�Ű�� �ϱ�
// bar �� JLabel ��ӹ��� MyLabel �� �ۼ��ϰ�,
// MyLabel �� paintComponent() �޼ҵ尡 bar �� ä�쵵��

class MyLabel extends JLabel{
	int barSize = 0;    // ���� ũ��
	int maxBarSize; 
	// �ѹ� ���Ŷ� �����ڷ� �ۼ�
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	// �ٿ� ������ �ö󰬴� �������� �ϴ� �׷��� �κ�
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)((double)(this.getWidth()/maxBarSize*barSize));
		if (width == 0)   // ���� ������ ������
			return;
		g.fillRect(0, 0, width, this.getHeight()); // ���ο� �װ��� ������ �簢�� �� ä���		
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) 
			// �̷��� Ÿ���� �����ϴ� �ڵ�� �����ؾ���. 
			// ������ wait �� �� ������ try catch �� ����ֱ�
			try {
				wait();   // �� ������ �پ�� ������ ��ٷ���
			} catch (InterruptedException e) {
				return;
			}
		barSize++;        // �� ���� �ʾҴٸ� �� ������ �ø���
		repaint();        // �� �ٽ� �׸���
		notify();         // ������ �����
	}
	synchronized void consume() {
		if(barSize == 0)
		// bar�� 0 �̸� Ŀ�������� ��ٸ��� ��
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		barSize--;   // 0 �� �ƴ϶� �������� ä���������� ����
		repaint();   // �� �ٽ� �׸���
		notify();
	}
}

class ConsumerThread extends Thread {
	MyLabel bar;
	
	public ConsumerThread(MyLabel bar) {
		this.bar = bar;
	}
	
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class TabAndThreadEx extends JFrame{
	
	MyLabel bar = new MyLabel(100);
	
	public TabAndThreadEx() {
		super("������ �ǽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		setSize(350, 200);
		setVisible(true);
		
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				bar.fill();
			}
		});
		
		setSize(350, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}

	public static void main(String[] args) {
		new TabAndThreadEx();
	}
}
