import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		// 현재 좌표 입력
		int curR = Integer.parseInt(st.nextToken()) - 1;
		int curC = Integer.parseInt(st.nextToken()) - 1;

		// 배열 입력
		char[][] arr = new char[10][10];
		for (int i = 0; i < 10; i++) {
			arr[i] = br.readLine().toCharArray();
		}

		// 폭탄 터짐
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[i][j] == 'o') {
					for (int k = 0; k < 10; k++) {
						// 행, 열 탐색
						if (j != k && arr[i][k]!='o')
							arr[i][k] = '1';
						if (i != k && arr[k][j]!='o')
							arr[k][j] = '1';
					}
				}
			}
		} // 폭탄 터트리는 반복문 (터지면 '1')

		// 폭탄 안 터진 좌표 탐색
		ArrayList<int[]> safe = new ArrayList<>(); // 폭탄 안 터진 좌표 저장

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[i][j] == 'x') {
					safe.add(new int[] { i, j });
				}
			}
		}

		// 최소 거리
		int ans = Integer.MAX_VALUE;

		// 최소 거리 탐색
		for (int i = 0; i < safe.size(); i++) {
			int rD = Math.abs(curR - safe.get(i)[0]);
			int cD = Math.abs(curC - safe.get(i)[1]);

			ans = Math.min(ans, rD + cD);
		}
		System.out.println(ans);
	}
}
