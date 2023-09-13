package ArraysPrograms;
import java.io.*;
public class For_ForEach_Loop {
	public static void main(String[] args) throws Exception {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	     System.out.println("Enter your Numbers: ");
		int[] arr1= new int[5];
		for(int i=0;i<arr1.length;i++ ) {
			String Str =br.readLine();
			arr1[i]=Integer.parseInt(Str);
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print("Here Print given Numbers in array : "+arr1[i]+" ");
		}
		 


		 
	}

}
