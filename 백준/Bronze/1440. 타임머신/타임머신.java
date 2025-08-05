/*
 * 
 * 걍 조합 계산하는 문데 아ㅣㅁ?
 * 아 근데 시가 문제넹..
 * 근데 걍 하면 될듯?
 * 세 가지수가 01 이랑 12사이인지 범위 체크 ~
 * 안에 들어가면 걍 하면 됨
 * 머리아파 ㅅㅂ
 * 
 * 걍 ㅈㄴ 시 기준이네....
 * 시 가능한 거 1개 => 무조건 2게
 * 시 가능한 거 2개 => 무조건 4개
 * 시 가능한 거 3개 => 무조건 6개
 * 시 가능한 거 0게 => 무조건 0개
 * 
 */

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력
		String[] tokens = br.readLine().split(":");
		int cnt =0;	// 시의 범위에 들어가는 수 카운트
		
		for(int i=0; i<tokens.length; i++) {
			int num = Integer.parseInt(tokens[i]);
			if(num>59) {
				System.out.println(0);
				return;
			}else if(num >=1 && num<=12) cnt++;
		}
		
		int ans = 0;
		switch(cnt) {
		case 0: 
			ans = 0;
			break;
		case 1:
			ans=2;
			break;
		case 2:
			ans=4;
			break;
		case 3:
			ans=6;
			break;
		}
		
		System.out.println(ans);
		
		
	}
}
