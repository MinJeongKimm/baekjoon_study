import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[] f, s;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine()); // 계단 수 입력
		f = new int[N + 1]; // 계단 정보 입력
		s = new int[N + 1]; // 각 층별 최댓값 입력
		for (int i = 1; i <= N; i++) {
			f[i] = Integer.parseInt(br.readLine());
		} // 계단 정보 입력

		// s(1), s(2)값 초기화
		// s(n) = Math.max(s(n-2) + f(n), s(n-3) + f(n-1) + f(n))
		
		int ans = 0;
		if (N == 1) {
			ans = f[1];
		} else if (N == 2) {
			ans = f[1] + f[2];
		} else {
			s[1] = f[1];
			s[2] = f[1] + f[2];

			for (int i = 3; i <= N; i++) {
				s[i] = Math.max(s[i - 2] + f[i], s[i - 3] + f[i - 1] + f[i]);
			}

			ans = s[N];
		}

		System.out.println(ans);
	}// main

}
