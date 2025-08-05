import java.util.*;
import java.io.*;

/*
 * 1. 중복 조합 ?
 *  사탕 N개
 * 택희, 영훈, 남규 : a, b, c
 * c >= b+2
 * a, b, c는 자연수 (1 이상)
 * 택희 = 2a
 * 
 * 2a + b+ 2+ k + b = N
 * 2a + 2b + 2 + k = N
 * a + b + 1 + k/2 = N/2
 * 
 * 2. 음... 삼중포문. ..? 
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int cnt = 0;

		// a는 짝수, c는 b+2 이상
		for (int a = 2; a <= N - 2; a+= 2) {
			for (int b = 1; b <= N - 2; b++) {
				for (int c = b+2; c <= N - 2; c++) {
					if (a + b + c == N) {
//						System.out.println("a: " + a + ", b: "+b + ", c: "+ c);
						cnt++;
					}

				}
			}
		}

		System.out.println(cnt);

	}
}
