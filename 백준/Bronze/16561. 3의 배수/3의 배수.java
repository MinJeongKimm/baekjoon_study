import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine())/3;
		
		// 정답 
		
		int ans = (N-1)*(N-2)/2;
		System.out.println(ans);
		br.close();
	}

}
