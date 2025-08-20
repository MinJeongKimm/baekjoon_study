/*
 * ( 이면 스택에 넣어 
 * ) 이면 스택에서 팝을해
 * 근데 스택에 empty다? isVPS = false임
 * 
 * 다 끝나고 나서 isempty 했는데 비어있지 않다? false임 !
 * 
 * if(isVPS) 에 따라 결과 출력 !
 * 
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());	// test case input
		
		for(int tc=1; tc<=T; tc++) {
			String input = br.readLine();
			Stack<Character> st = new Stack<>();
			boolean isVPS = true;
			
			
			for(int i=0; i<input.length(); i++) {
				char ch = input.charAt(i);
				if(ch == '(') {
					st.push(ch);
				}
				else{
					if(st.isEmpty()) {//  비어있으면 false
						isVPS = false;
						break;
					}
					else {
						st.pop();
					}
				}
			}// 문자열의 개수만큼 확인 
			
			if(!st.isEmpty()) isVPS = false;
			
			if(isVPS) System.out.println("YES");
			else System.out.println("NO");
			
		}// test case loop
		
	}
}
