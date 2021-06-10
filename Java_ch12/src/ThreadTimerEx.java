import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	JLabel timerLabel;    // 타이머 값이 출력되는 레이블
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	// 스레드 코드. run() 이 종료하면 스레드 종료
	public void run() {
		int n = 0;   // 타이머 카운트 값
		while(true) {   // 무한루프
			timerLabel.setText(Integer.toString(n)); // JLabel 스트링이니 숫자로 받고 문자로 바꿔주기
			n++;   // 카운트 증가
			// 스레드를 통해 초를 글씨 사이사이에 1000 seconds(1초) 정도 쉬게 하려고 함
			// 1초마다 count 하기 위해서
			try {
				Thread.sleep(1000); // sleep 이 굉장히 무서운 것. try, catch 로 무조건!
			}
			catch (InterruptedException e) {
				return;
			}
		}
		
	}
}

// Thread 를 상속받아 1초 단위 타이머 스레드 만들기
public class ThreadTimerEx extends JFrame {
	
	public ThreadTimerEx() {    // 생성자
		setTitle("스레드 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(250, 150);
		setVisible(true);
		
		th.start();   // 타이머 스레드의 실행을 시작하게 한다.
		// 스레드 객체의 run() 을 실행되게 함
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ThreadTimerEx();

	}

}
