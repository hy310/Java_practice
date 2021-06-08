import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	// ����ܾ�� �ѱ۴ܾ��� ���� HashMap �� �����ϰ�
	// ����ܾ�� �ѱ� �ܾ �˻��ϴ� ���α׷� �ۼ�
	
	public static void main(String[] args) {
		// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// 3���� (key, value) ���� dic �� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		// dic �ؽøʿ� ��� �ִ� ��� (key, value) �� ���
		Set<String> keys = dic.keySet(); 		// ��� Ű�� Set �÷��ǿ� �޾ƿ�
		Iterator<String> it = keys.iterator();  // Set �� �����ϴ� Iterator ����
		
		while(it.hasNext()) {
			String key = it.next();   // Ű
			String value = dic.get(key);   // ��
			System.out.print("(" + key + ", " + value + ")");
		}
		System.out.println();
		
		// ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.print("ã����� �ܾ��? ");
			String eng = scanner.next();
			// �ؽ� �ʿ��� 'Ű' eng �� '��' kor �˻�
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
		}
	}
}
