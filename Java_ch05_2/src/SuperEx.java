class Point{
	private int x, y;
	public Point() {      // ������ ���
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {   // ������ �ϳ� ��
		this.x = x;
		this.y = y;
	}
	public void showPoint() {     // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;        // ���� ��
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {     // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5,6, "blue");
		cp.showColorPoint();
	}
}
