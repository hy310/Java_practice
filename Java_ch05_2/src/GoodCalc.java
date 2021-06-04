
public class GoodCalc extends Calculator {
// 추상을 상속받으면 메소드를 다 구현하거나 아니면 그대로 남겨서 추상으로 남기.
// 현재는 추상클래스 Calculator 를 상속받은 GoodCalc 클래스 구현.
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i=0; i<a.length; i++)
				sum += a[i];
		return sum/a.length;
	}
	
	public static void main(String [] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] {2,3,4}));
	}

}
