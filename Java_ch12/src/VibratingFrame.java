import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

// 진동하는 스레드와 스레드의 강제 종료
// Runnable 을 받은 스레드를 작성하여 프레임이 심하게 진동하도록 하고,
// 컨텐트 팬에 마우스를 클릭하면 진동 스레드 종료시키기

public class VibratingFrame extends JFrame implements Runnable{
	
	Thread th;   // 진동하는 스레드
	
	public VibratingFrame() {
		setTitle("진동하는 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocation(300, 300); // 실제 움직일 위치를 수동 지정
		setVisible(true);
		
		// 마우스 어답터 만들어서 컨텐트팬에 붙이기. 
		// Mouse Pressed 만 필요하니 마우스 리스너가 아닌 어답터 이용
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive())   // 스레드가 살아있지 않다면 이미 꺼진거니까 그냥 리턴
					return;
				th.interrupt();    // 스레드가 살아있다면 강제로 멈춰버리기	
			}
		});
		th = new Thread(this);  // 진동 스레드 객체를 만들고
		th.start();             // 진동 스레드 실행 시작
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
			// 진동은 기준 좌표에서 random 으로 좌 우로 계속 움직이도록
			int x = getX() + r.nextInt() % 5; 
			// 강제로 새 위치 x 설정. (-4 ~ 4)
			int y = getY() + r.nextInt() % 5;
			setLocation(x, y);    // 프레임의 위치 이동
			// 처음의 (300, 300) 위치에서 run() 을 돌리면 위치 이동		
		}	
	}
}
