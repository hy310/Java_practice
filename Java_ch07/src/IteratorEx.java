import java.util.Iterator;
import java.util.Vector;

// ���� �˻� �κ��� Iterator<Integer> �� �̿��Ͽ� �����ϱ�

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		// Iterator �� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it = v.iterator(); // Iterator ��ü ���
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		// Iterator �� �̿��Ͽ� ��� ���� ���ϱ�
		int sum = 0;
		it = v.iterator();    // Iterator ��ü ���
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}
}
