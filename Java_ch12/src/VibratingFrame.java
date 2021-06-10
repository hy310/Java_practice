import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

// �����ϴ� ������� �������� ���� ����
// Runnable �� ���� �����带 �ۼ��Ͽ� �������� ���ϰ� �����ϵ��� �ϰ�,
// ����Ʈ �ҿ� ���콺�� Ŭ���ϸ� ���� ������ �����Ű��

public class VibratingFrame extends JFrame implements Runnable{
	
	Thread th;   // �����ϴ� ������
	
	public VibratingFrame() {
		setTitle("�����ϴ� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocation(300, 300); // ���� ������ ��ġ�� ���� ����
		setVisible(true);
		
		// ���콺 ����� ���� ����Ʈ�ҿ� ���̱�. 
		// Mouse Pressed �� �ʿ��ϴ� ���콺 �����ʰ� �ƴ� ����� �̿�
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive())   // �����尡 ������� �ʴٸ� �̹� �����Ŵϱ� �׳� ����
					return;
				th.interrupt();    // �����尡 ����ִٸ� ������ ���������	
			}
		});
		th = new Thread(this);  // ���� ������ ��ü�� �����
		th.start();             // ���� ������ ���� ����
	}
	
	public static void main(String[] args) {
		new VibratingFrame();
		

	}

	public void run() {
		Random r = new Random();
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				return;
			}
			// ������ ���� ��ǥ���� random ���� �� ��� ��� �����̵���
			int x = getX() + r.nextInt() % 5; 
			// ������ �� ��ġ x ����. (-4 ~ 4)
			int y = getY() + r.nextInt() % 5;
			setLocation(x, y);    // �������� ��ġ �̵�
			// ó���� (300, 300) ��ġ���� run() �� ������ ��ġ �̵�		
		}	
	}
}
