class Point{
	private int x, y;
	public Point() {      // 생성자 사용
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {   // 생성자 하나 더
		this.x = x;
		this.y = y;
	}
	public void showPoint() {     // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;        // 점의 색
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() {     // 컬러 점의 좌표 출력
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
