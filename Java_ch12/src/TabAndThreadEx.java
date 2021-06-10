import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


// wait, notify 를 이용한 바 채우기 스윙프로그램
// 스레드를 가진 bar 에 아무키나 눌러서 바 채워지게하고, 가만히 있으면 바 감소시키게 하기
// bar 는 JLabel 상속받은 MyLabel 로 작성하고,
// MyLabel 의 paintComponent() 메소드가 bar 를 채우도록

class MyLabel extends JLabel{
	int barSize = 0;    // 바의 크기
	int maxBarSize; 
	// 한번 돌거라 생성자로 작성
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	// 바에 게이지 올라갔다 내려갔다 하는 그래픽 부분
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)((double)(this.getWidth()/maxBarSize*barSize));
		if (width == 0)   // 폭이 없으면 나가기
			return;
		g.fillRect(0, 0, width, this.getHeight()); // 가로와 그것의 높이의 사각형 색 채우기		
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) 
			// 이렇게 타임을 조정하는 코드는 조심해야함. 
			// 영원히 wait 할 수 있으니 try catch 로 잡아주기
			try {
				wait();   // 바 사이즈 줄어들 때까지 기다려라
			} catch (InterruptedException e) {
				return;
			}
		barSize++;        // 꽉 차지 않았다면 바 사이즈 늘리기
		repaint();        // 바 다시 그리기
		notify();         // 스레드 깨우기
	}
	synchronized void consume() {
		if(barSize == 0)
		// bar가 0 이면 커질때까지 기다리면 됨
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		barSize--;   // 0 이 아니라 게이지가 채워져있으면 빼기
		repaint();   // 바 다시 그리기
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
		super("마지막 실습");
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
