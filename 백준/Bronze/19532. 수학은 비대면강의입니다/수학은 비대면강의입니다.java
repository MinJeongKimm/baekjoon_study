import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		int x = 0;
		int y = 0;

		/*
		 * adx + bdy = cd adx + aey = af
		 * 
		 * (bd-ae)y = cd-af y = (cd-af)/(bd-ae) or (a나 d가 0이 아닌 경우)
		 * 
		 * x = (c-by)/a or (f-ey)/d
		 * 
		 * aex + bey = ce bdx + bey = bf
		 * 
		 * (ae-bd)x = ce-bf x = (ce-bf)/(ae-bd) (b나 e가 0이 아닌 경우) y = (c-ax)/b or
		 * (f-dx)/e
		 * 
		 * 
		 */

		if (a != 0) {
			y = (c * d - a * f) / (b * d - a * e);
			x = (c - b * y) / a;
		} else if (d != 0) {
			y = (c * d - a * f) / (b * d - a * e);
			x = (f - e * y) / d;
		} else if (b != 0) {
			x = (c * e - b * f) / (a * e - b * d);
			y = (c - a * x) / b;
		} else if (e != 0) {
			x = (c * e - b * f) / (a * e - b * d);
			y = (f - d * x) / e;
		}

		System.out.println(x + " " + y);

	}
}
