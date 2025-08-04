import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;	 // 정답 변수 
		int res = N;	// 계산 값 
		
		while(cnt ==0 ||res != N) {
			int a;	// 각 자리수 합 
			int b;	// 오른쪽 자리수 

			if(res<10) {
				a = res;
				b = res*10;
				res = b + a;
			}else {
				a = res/10 + res%10;
				b = res%10;
				res = b*10 + a%10;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
