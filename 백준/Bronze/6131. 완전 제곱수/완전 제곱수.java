//package baekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("N을 입력하세");
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int a=1; a<=500; a++) {
			int aSquare = a*a;
			for(int b=1; b<=a; b++) {
				int bSquare = b*b;
				if(aSquare == bSquare + N) {
					cnt++;
				}
			}
		}
	
		
		System.out.println(cnt);
		
		
	}

}
