import java.io.*;
import java.util.*;

/*
 * 전체 탐색은 절대 안됨...
 * 
 * 이분 탐색... ?
 * 나무 중간 높이부터 시작
 * 
 * <정리>
 * 나무 자를 수 있는 범위
 * 0 <=   <= 나무 최대 높이?
 * 
 */

public class Main {
	static int N, M;
	static int[] tree;

	static int start, end, ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 나무의 수
		M = Integer.parseInt(st.nextToken()); // 가져가야하는 나무 높이

		start = 0;
		end = Integer.MIN_VALUE;
		ans = 0;

		tree = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			end = Math.max(end, tree[i]);
		} // 나무 높이 배열 입력

		cutting();
		System.out.println(ans);

	}// main

	static void cutting() {


		while (start <= end) {
			int height = (start + end) / 2;
			long sum = 0;

			for (int i = 0; i < N; i++) {
				if (tree[i] - height > 0)
					sum += (tree[i] - height);
			} // 잘린 나무 길이 계산

			// 확인
			if (sum >= M) { // 현재 합이 더 클 때 (더 높여보기)
				ans = Math.max(height, ans);
				start = height + 1;
			} else {// 현재 합보다 작을 때 (더 낮추기)
				end = height - 1;
			}

		}

	}

}
