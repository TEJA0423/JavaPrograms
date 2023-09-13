package StringsPrograms;
import java.util.*;
import java.io.*;
public class ConsoleInput {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();

 // using StringBufferReader
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a string :");
		String str2 = br.readLine();
		System.out.println("you have entered :"+str2);
		
	}

}
