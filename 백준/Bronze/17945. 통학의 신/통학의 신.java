// package baekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		
		int A = Integer.parseInt(str.nextToken());
		int B = Integer.parseInt(str.nextToken());
		
		// 근의 공식
		// ax^2 + bx + c = 0
		// x = (-b + sqrt(b^2 - 4ac)/ 2a
		
		double ans_1 = (-2*A + Math.sqrt(4*A*A - 4*B)) / 2 ;
		double ans_2 = (-2*A - Math.sqrt(4*A*A - 4*B)) / 2 ;
		
		if(ans_1 == ans_2) {
			System.out.println((int)ans_1);
		}else {
			System.out.println((int)ans_2 + " " + (int)ans_1);
		}
	

		
	}

}
