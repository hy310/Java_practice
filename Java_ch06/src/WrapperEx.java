
public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper Class Character ���
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		
		// ���� c1 �� ���ڸ� true
		if (Character.isDigit(c1))
			System.out.println(c1 + "�� ����");
		// ���� c2�� �������̸� true
		if (Character.isAlphabetic(c2))
			System.out.println(c2 + "�� ������");
		
		// Wrapper Class Integer ���
		System.out.println(Integer.parseInt("28"));  // ���ڿ� "28"�� 10������ ��ȯ
		System.out.println(Integer.toString(28));   // ���� 28�� 2���� ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(28));  // 28�� 16���� ���ڿ��� ��ȯ
		System.out.println(Integer.bitCount(28));        // 28�� ���� 2������ 1�� ����
		
		// �⺻Ÿ�� ������ Wrapper Integer ��ü ����
		Integer i = Integer.valueOf(28);
		System.out.println(i.doubleValue());   // ������ double ������ ��ȯ 28.0
		
		// Wrapper Class Double ���
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());   // Double�� ���ڿ� "3.14"�� ��ȯ
		System.out.println(Double.parseDouble("3.14")); // ���ڿ��� �Ǽ� 3.14�� ��ȯ
		
		// Wrapper Class Boolean ���
		boolean b = (4>3) ; // b�� true
		System.out.println(Boolean.toString(b));   // true�� ���ڿ� "true" �� ��ȯ
		System.out.println(Boolean.parseBoolean("false"));  // ���ڿ��� false �� ��ȯ
		
	}
}
