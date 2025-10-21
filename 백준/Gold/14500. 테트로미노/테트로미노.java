import java.util.*;
import java.io.*;

/*
 * 백트래킹으로 구현 ㄱㄱ
 * 
 * 4 케이스는 상하좌우 맘대로 선택 -> 한 정점으로 부터 3번동안 수행
 * 1 케이스(ㅗ) 는 예외 케이스 
 */

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;

	// 4 방향
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	static int ans;
	static List<int[]> neighbors;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} // 배열 입력

		// 정답 변수 초기화
		ans = Integer.MIN_VALUE;

		// 모든 좌표에 대해 테트로미노 계산 수행
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 1. 4 유형 테트로미노
				backtrack(i, j, 0, map[i][j]);

				// 2. ㅗ 테트로미노
				neighbors = new ArrayList<>();
				// 2-1. 상하좌우 탐색
				for (int d = 0; d < 4; d++) {
					int nR = i + dr[d];
					int nC = j + dc[d];

					if (nR < 0 || nR >= N || nC < 0 || nC >= M)
						continue;

					neighbors.add(new int[] { nR, nC });
				}

				// 2-2. 이웃 개수에 따라 계산 수행
				int tSum = map[i][j];

				if (neighbors.size() <= 2)
					continue;
				else if (neighbors.size() == 3) {
					for (int[] tmp : neighbors) {
						tSum += map[tmp[0]][tmp[1]];
					}
				} else { // 이웃 4개일 때
					int min = Integer.MAX_VALUE;

					for (int[] tmp : neighbors) {
						int num = map[tmp[0]][tmp[1]];
						tSum += num;
						min = Math.min(num, min);
					}
					tSum -= min; // 전체 합에서 최소 이웃값 뺌
				}

				// 3. 4 유형 테트로미노 최댓값과 ㅗ 테트로미노 최댓값 비교
				ans = Math.max(ans, tSum);
			}
		}

		System.out.println(ans);

	}// main

	// 4 유형 테트로미노에 대한 백트랙킹
	static void backtrack(int cR, int cC, int depth, int sum) {

		visited[cR][cC] = true; // 방문 처리

		// 종료 조건
		if (depth == 3) {
			ans = Math.max(ans, sum);
			visited[cR][cC] = false;
			return;
		}

		// 백트래킹
		for (int i = 0; i < 4; i++) {
			int nR = cR + dr[i];
			int nC = cC + dc[i];

			// 범위 체크
			if (nR < 0 || nR >= N || nC < 0 || nC >= M)
				continue;
			// 방문 체크
			if (visited[nR][nC])
				continue;

			// 방문 아직 안했으면
			sum += map[nR][nC];
			backtrack(nR, nC, depth + 1, sum);

			// 복구
			sum -= map[nR][nC];
		}

		visited[cR][cC] = false;

	}// 백트래킹 함수

}
