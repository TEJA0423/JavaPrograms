package StringsPrograms;

public class FindLengthOfString {

	public static void main(String[] args) {
		// another method of find length of the length
        String str="Hello World";
		int count=0;
		char[] ch = str.toCharArray();
	// for each loop	
		for(char x:ch) {
			count++;
			System.out.print( x+" ");
		}
		System.out.println();
		//System.out.println(count);
		System.out.println("length of the String is :"+ch.length);	
		
		System.out.println();
		
		String s1 ="Bootstrap";
		String s2 = "Pyhton";
		System.out.println("String length s1 : "+s1.length()+"\n"+" Second String length is: "+s2.length());
//		System.out.println("String length is : "+s2.length());
		
		System.out.println("---------------");

	}

}
