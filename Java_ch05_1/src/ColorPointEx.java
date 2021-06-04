class Point{
	private int x, y;      // �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void showPoint()   // ���� ��ǥ ���
	{
		System.out.println("("+ x + "," + y + ")");    // (1,1)
	}
}

// Point �� ��ӹ��� ColorPoint ����
class ColorPoint extends Point {
	private String color;     // ���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {    // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();         // ��ӹ��� Point �� showPoint() ȣ��
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();      // Point ��ü ����
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);               // Point Ŭ������ set() ȣ��
		cp.setColor("red");         // ColorPoint�� setColor() ȣ��
		cp.showColorPoint();        // �÷��� ��ǥ ���
	}
}
