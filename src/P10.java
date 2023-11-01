import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10 {
	public static void main(String[] args)throws IOException{
		System.out.println("please input the integer");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		if(num ==1)
			System.out.println("the input is 1");
		else
			System.out.println("the input is not 1");
	}

}
