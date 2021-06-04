class Shape {      // 도형의 슈퍼클래스
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {     // 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {     // 메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {      // 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	// paint 함수는 인자로 클래스 Shape 를 받음
	// Shape 를 상속받은 객체들이 매개변수로 넘어올 수 있음
	static void paint(Shape p) {
		p.draw();            // p 가 가리키는 객체에 오버라이딩된 draw() 호출
							 // 동적바인딩
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		paint(line);           // Line의 draw() 실행. "Line" 출력
		
		paint(new Shape());           // Shape 의 draw() 실행
		paint(new Line());            // 오버라이딩된 메소드 Line 의 draw() 
		paint(new Rect());            // 오버라이딩된 메소드 Rect의 draw()
		paint(new Circle());          // 오버라이딩된 메소드 Circle의 draw()
	}
}
