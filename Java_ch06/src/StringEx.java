
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		// Wrapper Class ��Ʈ�� Ŭ������ �ֿ� �޼ҵ�
		System.out.println(a + "�� ���̴� " + a.length());  // ���ڿ��� ����(���ڰ���)
		System.out.println(a.contains("#"));    // ���ڿ��� ���� ���� : true
		
		a = a.concat(b);     // ���ڿ� ����
		System.out.println(a);
		
		a = a.trim();       // ���ڿ� �� ���� ���� ����
		System.out.println(a);
		
		a = a.replace("C#", "Java");   // ���ڿ� ��ġ
		System.out.println(a);
		
		String s[] = a.split(",");    // ���ڿ� �и�
		for (int i=0; i<s.length; i++)
			System.out.println("�и��� ���ڿ�" + i + ":" + s[i]);
		
		a = a.substring(5);   // �ε��� 5���� ������ ���� ��Ʈ�� ����
		System.out.println(a);    // a = "C++"
		
		char c = a.charAt(2);     // �ε��� 2�� ���� ����
		System.out.println(c);    // "+"
	}
}
