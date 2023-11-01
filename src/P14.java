import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14 {
	public static void main(String [] args)throws IOException{
		System.out.println("please input the integer");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		switch(num) {
		case 1:{
			System.out.println("the input is 1");
			break;
		}
		case 2:{
			System.out.println("the input is 2");
			break;
		}
		default:{
			System.out.println("please input 1 or 2");
			break;
			
		}
		}
	}

}
