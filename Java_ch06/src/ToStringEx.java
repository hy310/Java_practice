class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {   // Point 객체를 문자열로
		return "Point(" + x + "," + y + ")";
	}
	
}
public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a);    // a는 a.toString() 으로 자동변환됨
	}
}
