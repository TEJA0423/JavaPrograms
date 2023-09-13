package StringsPrograms;

public class StringToFloat {

	public static void main(String[] args) {
		String str = "120";
		float val = Float.parseFloat(str);
		System.out.println("String convert to Float value :" + val);

		System.out.println();
	// Java Program to Illustrate String Interpolation
		
		String s1 = "Vtalent";
		String s2 = "Coding";
		
	// Two ways to print output 
		System.out.println(s1 + " is the best platform to learn " + s2);
		System.out.println();
		System.out.println(String.format( "%s is the best platform to learn %s .", s1 , s2));
	
		System.out.println();
	// Java Program to Print a New Line in String
		String newline = System.lineSeparator();
		System.out.println("Hello "+ newline + "World");
		System.out.println();
		
	//Java Program to Convert String to String Array
		String str1 = "Hai Hello World";
		String strArray[] = str1.split(" ");
		System.out.println("String :"+ str1);
		System.out.print("String Array : [");
		
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]+ " ");
		}
		System.out.println("]");
		
	}

}
