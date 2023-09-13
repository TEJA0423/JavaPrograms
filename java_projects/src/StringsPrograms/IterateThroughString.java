package StringsPrograms;

public class IterateThroughString {

	public static void main(String[] args) {
		 String str= "JAVA";
		 for(int i=0;i<str.length();i++) {
			 if(i<str.length()-1) {
			     System.out.print(str.charAt(i)+"  ");
			 } else {
				 System.out.print(str.charAt(i));
			 } 
		 }
		 System.out.println();
 // Java Program to Replace Multiple Characters in a String
		 
		String str2 = new String("Welcome to Vtalent Institute ");
		System.out.println("Original string is :  "+ str2);
		System.out.println("After Replacing e with E :  "+ str2 .replace('e', 'E'));
		System.out.println();
		
// Java Program to Print Quotation Marks in a String
		
		String s1 = " \" Hello Everyone in vtalent\" ";
		System.out.println(s1);
		
	}

	}


