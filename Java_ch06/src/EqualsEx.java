class Point02{
	private int x, y;
	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point02 p = (Point02)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point02 a = new Point02(2, 3);
		Point02 b = new Point02(2, 3);
		Point02 c = new Point02(3, 4);
		
		if (a==b)
			System.out.println("a==b");
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
	}
}
