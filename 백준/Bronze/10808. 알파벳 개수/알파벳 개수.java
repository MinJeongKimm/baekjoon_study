import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		int[] cnt = new int[26];	// a~z 개수 저장 배열
		
		// 카운팅  
		for(int i=0; i<str.length(); i++) {
			int n = str.charAt(i)-'a';	// 
			cnt[n]++;
		}
		
		// 결과 출력 
		for(int i=0; i<cnt.length; i++) {
			System.out.print(cnt[i] + " ");
		}
		
		
	}
}
