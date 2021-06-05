import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();        // �и��� ��ū����
		System.out.println("��ū ���� = " + n);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();    // ��ū ���
			System.out.println(token);        // ��ū ���
		}
	}
}
