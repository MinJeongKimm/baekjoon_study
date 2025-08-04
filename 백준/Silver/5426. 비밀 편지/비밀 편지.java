import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int tc = 0; tc < T; tc++) {
			String str = br.readLine(); // 문자열 입력

			int len = str.length();
			int sqrt = 1;
			while (sqrt * sqrt != len) {
				sqrt++;
			}

			char[][] arr = new char[sqrt][sqrt];

			for (int i = 0; i < sqrt; i++) {
				for (int j = 0; j < sqrt; j++) {
					arr[i][j] = str.charAt(i * sqrt + j);
				}
			}

			for (int j = sqrt - 1; j >= 0; j--) {
				for (int i = 0; i < sqrt; i++) {
					sb.append(arr[i][j]);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);

	}
}
