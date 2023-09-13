package MethodsPrgrams;

public class ReverseStringMethod {

	public static void main(String[] args) {
		 ReverseStringMethod s1 = new  ReverseStringMethod();
		 String str = "Hello World";
		 
		 String reverseString = s1.reverseString(str);
		 System.out.println( reverseString);

	}

	private String reverseString(String s1) {
		String result ="";
		for(int i=s1.length()-1;i>=0;i--){
			result += s1.charAt(i);
		}
		
		return result;
	}

}
