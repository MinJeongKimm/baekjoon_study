import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n<min) min = n;
			if(n>max) max = n;
		}
		
		System.out.println(min + " " + max);
		
		
	}
}
