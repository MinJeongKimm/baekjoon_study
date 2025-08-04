import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 각 주사위 면의 개수 
		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		int S3 = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[S1+S2+S3+1];
		int sum;
		
		int idxS1=1, idxS2 =1, idxS3=1;
		int cntM = S1*S2*S3;	// 경우의 수
		int cnt = 0;	
		
		while(cnt<cntM) {
			
			sum = idxS1+idxS2+idxS3;
			
			arr[sum]++;
			idxS3++;
			if(idxS3 > S3) {	// 마지막 수가 주사위의 면 수 보다 커지면
				idxS3 = 1;
				idxS2++;
			}
			if(idxS2 > S2) {	// 두번째 수가 주사위의 면 수 보다 커지면
				idxS2=1;
				idxS3=1;
				idxS1++;
			}
			cnt++;
		}
		
		int max = 0;	// 최댓값
		int ans = 0;	// 정답
		// 최댓값의 index 탐색
		for(int i=0; i<S1+S2+S3+1; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ans = i;
			}
		}
			
		System.out.println(ans);
		
	}
}
