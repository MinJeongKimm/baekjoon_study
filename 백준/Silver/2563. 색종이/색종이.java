import java.io.*;
import java.util.*;

/*
 * 1. 겹치는 영역을 뺄까?
 * 2. 흰 영역을 뺄까?
 * 
 * 1번 선택 
 * 음 배열을 1로 채울까.....
 * 
 * arr[100][100] int형 배열로...
 *	범위 안에 들어가면 1로 바꿈
 * 전체 다 바꾼 후에 1인거 카운트 ..?
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 색종이 수
		int N = Integer.parseInt(br.readLine());
		// 색종이 배열
		int[][] arr = new int[100][100];

		for (int t = 0; t < N; t++) {
			StringTokenizer rc = new StringTokenizer(br.readLine());
			int C = Integer.parseInt(rc.nextToken());
			int R = Integer.parseInt(rc.nextToken());

			for (int i = R; i < R + 10; i++) {
				if (i >= 100)
					break;
				for (int j = C; j < C + 10; j++) {
					// 도화지 벗어나는 경우
					if (j >= 100)
						break;
					arr[i][j] = 1;
				}
			} // 색종이 범위만큼 해당 맵의 요소를 1로 저장
		} // 색종이 수 만큼 색종이 좌표 입력

		// 면적의 넓이
		int ans = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] == 1)
					ans++;
			}
		}

		System.out.println(ans);
	}
}
