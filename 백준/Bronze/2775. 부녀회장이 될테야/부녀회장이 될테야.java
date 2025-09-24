import java.util.*;
import java.io.*;

/*
 * 누적합? => 메모이제이션,,??? 근데 이게 뭐더라..
 */
public class Main {
	static int K, N;	//k층 n호
	static int[][] apt;	//각 호수 별 거주 인원 저장 배열
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			K = Integer.parseInt(br.readLine());
			N = Integer.parseInt(br.readLine());
			
			apt = new int[K+1][N+1];	//여기까지만 봐도 됨 (더 높은 층이나 호수 볼 필요 x)
			
			for(int j=1; j<=N; j++) {
				apt[0][j] = j;
			}//0층 초기화
			
			//누적합 구하기
			for(int i=1; i<=K; i++) {
				for(int j=1; j<=N; j++) {
					apt[i][j] = apt[i][j-1]+apt[i-1][j];
				}
			}
			
			System.out.println(apt[K][N]);
			
			
		}// test case loop
	}
}
