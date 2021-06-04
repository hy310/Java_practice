// 추상클래스는 메소드에 이름만 들어가고 내용 들어가지 않음
abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);     // 평균이라 소수점
}

