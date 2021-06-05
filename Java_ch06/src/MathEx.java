
public class MathEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-3.14));         // 절댓값 구하기
		System.out.println(Math.sqrt(9.0));          // 9의 제곱근 = 3
		System.out.println(Math.exp(2));             // e^2
		System.out.println(Math.round(3.14));        // 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.println("이번주 행운의 번호는 ");
		for (int i=0; i<5; i++)
			System.out.print((int)(Math.random()*45+1) + " ");
			// 45 + 1 == 1부터 45까지 라는 뜻. 더하는 것이 아님
	}
}
