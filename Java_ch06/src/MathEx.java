
public class MathEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-3.14));         // ���� ���ϱ�
		System.out.println(Math.sqrt(9.0));          // 9�� ������ = 3
		System.out.println(Math.exp(2));             // e^2
		System.out.println(Math.round(3.14));        // �ݿø�
		
		// [1, 45] ������ ������ ���� 5�� �߻�
		System.out.println("�̹��� ����� ��ȣ�� ");
		for (int i=0; i<5; i++)
			System.out.print((int)(Math.random()*45+1) + " ");
			// 45 + 1 == 1���� 45���� ��� ��. ���ϴ� ���� �ƴ�
	}
}
