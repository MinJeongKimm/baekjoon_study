import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String strN = String.valueOf(N);
		int length = strN.length();

		for (int i = 1; i < length; i++) {
			String front = strN.substring(0, i); // 앞자리 수
			String back = strN.substring(i); // 뒷자리 수

			int m_a = 1; // 앞자리 수 곱
			int m_b = 1; // 뒷자리 수 곱

			for (char c : front.toCharArray()) {
				m_a *= c - '0';
			}
			for (char c : back.toCharArray()) {
				m_b *= c - '0';
			}

			if(m_a == m_b) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");

	}

}
