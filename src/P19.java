import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P19 {
	public static void main(String[] args) throws IOException {
		System.out.println("are you a man?");
		System.out.println("input y or n");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br1.readLine();
		char letter = str.charAt(0);
		if (letter == 'y' || letter == 'Y')
			System.out.println("you are the man");
		else if (letter == 'n' || letter == 'N')
			System.out.println("you are the womman");
		else
			System.out.println("please input y or n");
	}
}
