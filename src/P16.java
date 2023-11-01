import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16 {
	public static void main(String [] args)throws IOException{
		System.out.println("please input a or b");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		char letter = str1.charAt(0);
		switch(letter) {
		case 'a':{
			System.out.println("the input is a");
			break;
		}
		case 'b':{
			System.out.println("the input is b");
			break;
		}
		default:{
			System.out.println("please input a or b");
			break;
			
		}
		}
	}

}
