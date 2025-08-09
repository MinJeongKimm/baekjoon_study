import java.io.*;
import java.util.*;

/*
 * 가장 많이 사용된 알파벳여러개일때 어케 처리할지 ? => 이 부분 생각 필요
 * 그리고 걍 싹 다 대문자로 바꿔버려 ㅇㅇ 
 */

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] cnt = new int[26];	//A~Z(a~z) 개수 저장 배열 
		
		
		// 알파벳 빈도수 저장 
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >='a' && ch<='z') {
				cnt[ch-'a']++;
			}else {
				cnt[ch-'A']++;
			}
		}
		
		// 빈도수 max 값 찾기
		int max = 0;
		int maxCnt = 0;
		int maxIdx = 0;
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i]>max) {	// 최대값 발견시 
				max = cnt[i];
				maxIdx = i;
				maxCnt = 0;
			}else if(cnt[i] == max) {
				maxCnt++;	// 최댓값 동일한 거 있으면 maxCnt 증가
			}
		}
		
		if(maxCnt == 0) {
			int ans = 'A'+ maxIdx;
			System.out.println((char)ans);
		}else {
			System.out.println("?");
		}
		
	}
}
