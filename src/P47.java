import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class P47 {
	public static void main(String[] args) throws IOException {
		System.out.println("please input five integer");
		Integer []a = new Integer[5];

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i<=4; i++) {
			String str = br1.readLine();
			a[i] = Integer.parseInt(str);
		}
		Arrays.sort(a,Collections.reverseOrder());
		
		for(int y= 0; y <a.length ; y ++)
			System.out.println("number: " + (y+1) + " score: " + a[y]);

	}
}
