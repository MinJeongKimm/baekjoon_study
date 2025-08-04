
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer dims = new StringTokenizer(br.readLine());

		// 행 열 입력 
		int R = Integer.parseInt(dims.nextToken());
		int C = Integer.parseInt(dims.nextToken());
		// 방향 탐색 배열
		int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };
		int dir = 8;
	
		while(!(R==0 && C==0)) {
			// 지뢰밭
			char[][] pMap = new char[R + 2][C + 2];

			for (int i = 1; i < R + 1; i++) {
				String str = br.readLine();
				for (int j = 1; j < C + 1; j++) {
					pMap[i][j] = str.charAt(j-1);
				}
			}

			for (int i = 1; i < R + 1; i++) {
				for (int j = 1; j < C + 1; j++) {
					char cnt = '0'; // 지뢰 카운트
					for (int idx = 0; idx < dir; idx++) {
						int curR = i + dr[idx];
						int curC = j + dc[idx];

						if (pMap[curR][curC] == '*') {
							cnt++;
						}
					} // 방향 탐색하면서 지뢰 찾
					if (pMap[i][j] == '.') {
						pMap[i][j] = cnt;
					}
				}
			}

			// 지뢰밭 출력
			for (int i = 1; i < R + 1; i++) {
				for (int j = 1; j < C + 1; j++) {
					System.out.print(pMap[i][j]);
				}
				System.out.println();
			}
			
			dims = new StringTokenizer(br.readLine());

			// 행 열 입력
			R = Integer.parseInt(dims.nextToken());
			C = Integer.parseInt(dims.nextToken());
		}
	}

}
