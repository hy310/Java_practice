class Shape {      // ������ ����Ŭ����
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {     // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {     // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {      // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	// paint �Լ��� ���ڷ� Ŭ���� Shape �� ����
	// Shape �� ��ӹ��� ��ü���� �Ű������� �Ѿ�� �� ����
	static void paint(Shape p) {
		p.draw();            // p �� ����Ű�� ��ü�� �������̵��� draw() ȣ��
							 // �������ε�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		paint(line);           // Line�� draw() ����. "Line" ���
		
		paint(new Shape());           // Shape �� draw() ����
		paint(new Line());            // �������̵��� �޼ҵ� Line �� draw() 
		paint(new Rect());            // �������̵��� �޼ҵ� Rect�� draw()
		paint(new Circle());          // �������̵��� �޼ҵ� Circle�� draw()
	}
}
