// package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		
		int tmp = N/100*100; // N의 뒤 두자리 00으로 바꿈 ㅇㅇ
		int ans;
		
		
		for(ans = 0; ans<100; ans++) {
			if((tmp+ans)%F == 0) {
				break;
			}
		}
		
		System.out.printf("%02d",ans);
//		System.out.printf("%02sd", ans);
	
		
		
		
		
		/*
		 * 코드 고민
		 * 
		 * String으로 받을까? 요소 인덱스로 따오게
		 * String으로 ㄱㄱ
		 * 
		 * 
		 * 아니다 걍 int로 가져와
		 * 그리고 뒤에 00부터 99까지 for문 돌려
		 * 그중에 해결하면 다행
		 * 아니면 .. 음
		 * 
		 * 
		 */

	}

}
