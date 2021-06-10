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
	
	// 스레드 코드. run() 이 종료하면 스레드 종료
	public void run() {
		int n=0;   // 타이머 카운트 값
		while(true) {    // 무한 루프
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);   // 1초 동안 잠 잔다
			}
			catch (InterruptedException e) {
				return;
			}
		}
	}	
}

public class RunnableTimerEx extends JFrame {
	
	public RunnableTimerEx() {
		setTitle("스레드 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);   // 스레드 객체 생성
		// runnable 안에 thread 가 들어있기 때문에 값만 던져주면 됨
		
		setSize(250, 150);
		setVisible(true);	
		
		th.start();  // 타이머 스레드가 run() 을 통해 실행을 시작하게 한다.
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
	}
}
